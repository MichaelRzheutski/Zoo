package academy.belhard.animals;

public class Tiger extends Animal {
    private String woolType;

    public Tiger(String animalType, String woolType) {
        super(animalType);
        this.woolType = woolType;
    }

    @Override
    public void move() {
        System.out.println("Тигр бегает по суше");
    }

    @Override
    public void breathe() {
        System.out.println("Тигр дышит воздухом");
    }

    public void speedRun() {
        System.out.println("Тигр быстро мчится");
    }

    @Override
    public void showAnimalInfo() {
        move();
        breathe();
        speedRun();
    }


    public String getWoolType() {
        return woolType;
    }

    public void setWoolType(String woolType) {
        this.woolType = woolType;
    }

}
