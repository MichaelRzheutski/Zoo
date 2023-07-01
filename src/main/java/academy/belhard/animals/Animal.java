package academy.belhard.animals;

public abstract class Animal {
    protected String animalType;

    public Animal(String animalType) {
        this.animalType = animalType;
    }

    public abstract void move();
    public abstract void breathe();
    public abstract void showAnimalInfo();

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
