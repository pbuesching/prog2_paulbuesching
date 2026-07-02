package zoo.enclosures;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import zoo.animals.*;

public class Enclosure<T extends Animal> {
  public String name;
  public Set<T> inhabitants;

  public Enclosure(String enc_name) {
    this.name = enc_name;
    this.inhabitants = new HashSet<>();
  }

  public String getName() {
    return name;
  }

  public boolean add(T animal) {
    return inhabitants.add(animal);
  }

  public boolean remove(T animal) {
    return inhabitants.remove(animal);
  }

  public List<T> getInhabitants() {
    return List.copyOf(inhabitants);
  }
}
