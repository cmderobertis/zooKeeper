public class Mammal {
    private int energyLevel;
    public static final int DEFAULT_ENERGY_LEVEL = 100;

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    void displayEnergy() {
        System.out.println("Energy: " + this.energyLevel);
    }

    int getEnergyLevel() {
        return this.energyLevel;
    }

    void increaseEnergyLevel(int amount) {
        this.energyLevel += amount;
    }

    void decreaseEnergyLevel(int amount) {
        this.energyLevel -= amount;
    }
}
