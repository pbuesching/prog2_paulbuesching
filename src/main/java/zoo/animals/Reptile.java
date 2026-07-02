package zoo.animals;

public sealed interface Reptile extends Animal permits Tortoise, Crocodile {}
