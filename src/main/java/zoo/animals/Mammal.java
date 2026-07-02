package zoo.animals;

public sealed interface Mammal extends Animal permits Cat, Rodent, Primate {}
