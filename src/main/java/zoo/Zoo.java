package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.logging.*;
import java.util.stream.Collectors;
import zoo.animals.*;
import zoo.enclosures.*;

public class Zoo {

  public static final Logger l = Logger.getLogger(Zoo.class.getName());
  public List<Enclosure<? extends Animal>> enclosures = new ArrayList<>();

  public void addEnclosure(Enclosure<? extends Animal> enclosure) {

    l.info("addEnclosure aufgerufen: " + enclosure.getName());

    enclosures.add(enclosure);

    l.fine("Gehege Hinzugefuegt. Neue Anzahl: " + enclosures.size());
  }

  public List<Enclosure<? extends Animal>> getEnclosures() {

    l.info("getEnclosures aufgerufen");

    return enclosures;
  }

  public Enclosure<? extends Animal> getEnclosureByName(String name) {

    if (name == null) {
      l.severe("Keine Name zum Suchen gegeben");
      return null;
    }

    l.info("getEnclosureByName aufgerufen. Gesuchter Name: " + name);

    Enclosure<? extends Animal> foundEnc =
        enclosures.stream().filter(enc -> enc.getName().equals(name)).findFirst().orElse(null);

    if (foundEnc == null) {
      l.warning("Kein Gehege mit dem Namen '" + name + "' gefunden");
    } else {
      l.fine("Gehege " + name + " gefunden");
    }

    return foundEnc;
  }

  public List<Animal> getAllAnimals() {

    l.info("getAllAnimals aufgerufen");

    List<Animal> foundAni =
        enclosures.stream()
            .flatMap(enc -> enc.getInhabitants().stream())
            .map(ani -> (Animal) ani) // Cast zu Klasse Animal für Return Liste
            .toList();

    l.fine(foundAni.size() + " Tiere gefunden");

    return foundAni;
  }

  public List<Mammal> getAllMammals() {

    l.info("getAllMammals aufgerufen");

    List<Mammal> foundMam =
        enclosures.stream()
            .flatMap(enc -> enc.getInhabitants().stream())
            .filter(mam -> mam instanceof Mammal)
            .map(mam -> (Mammal) mam) // Cast zu Klasse Mammal für Return Liste
            .toList();

    l.fine(foundMam.size() + " Tiere gefunden");

    return foundMam;
  }

  public List<Animal> getAnimalsByPredicate(Predicate<Animal> predicate) {
    l.info("getAnimalsByPredicate aufgerufen mit Predicate: " + predicate.toString());

    return enclosures.stream()
        .flatMap(enc -> enc.getInhabitants().stream())
        .filter(predicate)
        .map(ani -> (Animal) ani) // Cast zu Klasse Mammal für Return Liste
        .toList();
  }

  public Map<Class<? extends Animal>, Long> countAnimalsByType() {

    l.info("countAnimalsByType aufgerufen");

    Map<Class<? extends Animal>, Long> count =
        enclosures.stream()
            .flatMap(enc -> enc.getInhabitants().stream())
            .collect(Collectors.groupingBy(Animal::getClass, Collectors.counting()));

    l.fine(count.size() + " Tiere gefunden");

    return count;
  }

  public List<Enclosure<? extends Animal>> getOvercrowdedEnclosures(int maxAnimals) {

    l.info("getOvercrowdedEnclosures aufgerufen");

    if (maxAnimals < 1) {
      l.warning("Maximal Anzahl fuer Gehege kleiner als 1 angegeben");
    }

    List<Enclosure<? extends Animal>> count =
        enclosures.stream().filter(enc -> enc.getInhabitants().size() > maxAnimals).toList();

    l.fine(count.size() + " Gehege sind ueberfuellt");

    return count;
  }

  public String summary() {

    l.info("summary aufgerufen");

    List<Animal> animals = getAllAnimals();

    long mammalsCount = animals.stream().filter(ani -> ani instanceof Mammal).count();
    long birdsCount = animals.stream().filter(ani -> ani instanceof Bird).count();
    long fishCount = animals.stream().filter(ani -> ani instanceof Fish).count();
    long reptileCount = animals.stream().filter(ani -> ani instanceof Reptile).count();
    long animalCount = animals.size();

    int encSize = enclosures.size();
    String resultString =
        "Zoo mit "
            + encSize
            + " Gehegen und "
            + animalCount
            + " Tieren: "
            + mammalsCount
            + " Mammals, "
            + birdsCount
            + " Birds, "
            + fishCount
            + " Fish und "
            + reptileCount
            + " Reptiles";

    l.fine("Summary erstellt");
    l.fine(resultString);

    return resultString;
  }
}
