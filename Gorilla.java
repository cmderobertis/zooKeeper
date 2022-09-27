public class Gorilla extends Mammal {
    Gorilla() {
        super(Mammal.DEFAULT_ENERGY_LEVEL);
    }
    void throwSomething() {
        System.out.println("The gorilla threw something!");
        this.decreaseEnergyLevel(5);
    }

    void eatBananas() {
        System.out.println("The gorilla ate some bananas and is quite satisfied.");
        this.increaseEnergyLevel(10);
    }

    void climb() {
        System.out.println("The gorilla climbed up a tree.");
        this.decreaseEnergyLevel(10);
    }
}
