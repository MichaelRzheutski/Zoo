package academy.belhard.birds;

public abstract class Bird {
    protected String birdType;

    public Bird(String animalType) {
        this.birdType = animalType;
    }

    public abstract void move();
    public abstract void breathe();
    public abstract void showBirdInfo();

    public String getBirdType() {
        return birdType;
    }

    public void setBirdType(String birdType) {
        this.birdType = birdType;
    }
}
