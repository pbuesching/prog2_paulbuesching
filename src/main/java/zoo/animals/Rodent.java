package zoo.animals;

public sealed interface Rodent extends Mammal permits Bever, Hamster {}
