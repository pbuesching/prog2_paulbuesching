package zoo.animals;

public sealed interface Fish extends Animal permits Shark, Clownfish {}
