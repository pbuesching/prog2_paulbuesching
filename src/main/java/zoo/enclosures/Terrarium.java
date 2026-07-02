package zoo.enclosures;

import zoo.animals.*;

public class Terrarium<T extends Reptile> extends Enclosure<T> {

  public Terrarium(String name) {
    super(name);
  }
}
