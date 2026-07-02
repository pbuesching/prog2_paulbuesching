package zoo.animals;

public sealed interface Cat extends Mammal permits DomesticCat, Lion {}
