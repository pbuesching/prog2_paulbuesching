package zoo.enclosures;

import zoo.animals.*;

public class CatHouse<T extends Cat> extends Enclosure<T> {

  public CatHouse(String name) {
    super(name);
  }
}
