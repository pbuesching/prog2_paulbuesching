package zoo.animals;

public sealed interface Bird extends Animal permits Duck, Hawk {}
