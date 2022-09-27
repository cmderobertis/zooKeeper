public class Mammal {
    private int energyLevel = 100;

    int displayEnergy() {
        System.out.println("Energy: " + this.energyLevel);
        return this.energyLevel;
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
