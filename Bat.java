public class Bat extends Mammal {
    Bat() {
        super(300);
    }

    void fly() {
        System.out.println("*flutter* *flutter* *flutter* *flutter*");
        super.decreaseEnergyLevel(50);
    }

    void eatHumans() {
        super.increaseEnergyLevel(25);
    }

    void attackTown() {
        System.out.println("AAHHHH! The town is on fire! *crackle* *crackle*");
        super.decreaseEnergyLevel(100);
    }
}
