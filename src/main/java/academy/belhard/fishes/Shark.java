package academy.belhard.fishes;

public class Shark extends Fish {
    String teethType;

    public Shark(String fishType, String teethType) {
        super(fishType);
        this.teethType = teethType;
    }

    @Override
    public void move() {
        System.out.println("Акула плавает в воде");
    }

    @Override
    public void breathe() {
        System.out.println("Акула дышит под водой");
    }

    public void showTeeth() {
        System.out.println("Акула показывает зубы");
    }

    @Override
    public void showFishInfo() {
        move();
        breathe();
        showTeeth();
    }

    public String getTeethType() {
        return teethType;
    }

    public void setTeethType(String teethType) {
        this.teethType = teethType;
    }
}
