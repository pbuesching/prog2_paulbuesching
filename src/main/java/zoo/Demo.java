package zoo;

import java.util.logging.*;
import zoo.animals.*;
import zoo.enclosures.*;

public class Demo {

  public static void main() {

    Logger l = Logger.getLogger(Zoo.class.getName());

    // Sehen aller LOGS
    l.setLevel(Level.FINE);

    for (Handler h : Logger.getLogger("").getHandlers()) {
      h.setLevel(Level.FINE);
    }

    Zoo Osnabrueck = new Zoo();

    Lion Leo = new Lion("Leo", 20);
    DomesticCat Kitty = new DomesticCat("Kitty", 9);
    Lion Leonie = new Lion("Leonie", 25);

    CatHouse<Cat> TigerKaefig = new CatHouse<>("TigerKaefig");
    TigerKaefig.add(Leo);
    TigerKaefig.add(Kitty);
    TigerKaefig.add(Leonie);

    Clownfish Merlin = new Clownfish("Merlin", 10);
    Clownfish Nemo = new Clownfish("Nemo", 2);
    Shark Haidi = new Shark("Haidi", 42);

    Aquarium<Fish> Pazifik = new Aquarium<>("Pazifik");
    Pazifik.add(Haidi);
    Pazifik.add(Merlin);
    Pazifik.add(Nemo);

    Osnabrueck.addEnclosure(TigerKaefig);
    Osnabrueck.addEnclosure(Pazifik);

    Osnabrueck.countAnimalsByType();
    Osnabrueck.getAllMammals();
    Osnabrueck.getOvercrowdedEnclosures(-1);
    Osnabrueck.getEnclosureByName(null);

    // Ab hier werden nur noch Logs mit höherer Priorität angezeigt (Warning /Severe) Dieser Log
    // dient zur sichtbarkeit innerhalb der Logs um den Umbruch zu erkennen.
    l.info("Ab hier werden nur noch Warnings/Severes geloggt \n\n");

    // Der Handler muss nicht mehr umgeschalten werden, da durch den Logger eh nur noch Warnings und
    // Severes kommen

    l.setLevel(Level.WARNING);

    Zoo Bielefeld = new Zoo();

    Bielefeld.addEnclosure(TigerKaefig);
    Bielefeld.addEnclosure(Pazifik);

    Bielefeld.countAnimalsByType();
    Bielefeld.getAllMammals();
    Bielefeld.getOvercrowdedEnclosures(-1);
    Bielefeld.getEnclosureByName(null);
  }
}
