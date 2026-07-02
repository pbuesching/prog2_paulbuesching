package zoo.animals;

public sealed interface Primate extends Mammal permits Orangutan, Gorilla {}
