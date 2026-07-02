package zoo.enclosures;

import zoo.animals.*;

public class MammalHouse<T extends Mammal> extends Enclosure<T> {

  public MammalHouse(String name) {
    super(name);
  }
}
