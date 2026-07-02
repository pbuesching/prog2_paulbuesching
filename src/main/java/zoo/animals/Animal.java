package zoo.animals;

public sealed interface Animal permits Bird, Reptile, Fish, Mammal {}
