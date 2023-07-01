package academy.belhard.animals;

public class Lion extends Animal {
    private String mane;

    public Lion(String animalType, String mane) {
        super(animalType);
        this.mane = mane;
    }

    @Override
    public void move() {
        System.out.println("Лев бегает по суше");
    }

    @Override
    public void breathe() {
        System.out.println("Лев дышит воздухом");
    }

    public void roar() {
        System.out.println("Лев рычит");
    }

    @Override
    public void showAnimalInfo() {
        move();
        breathe();
        roar();
    }

    public String getMane() {
        return mane;
    }

    public void setMane(String mane) {
        this.mane = mane;
    }
}
