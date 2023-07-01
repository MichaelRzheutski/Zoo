package academy.belhard.fishes;

public class SwordFish extends Fish {
    private String noseSize;

    public SwordFish(String fishType, String noseSize) {
        super(fishType);
        this.noseSize = noseSize;
    }

    @Override
    public void move() {
        System.out.println("Рыба-меч плавает в воде");
    }

    @Override
    public void breathe() {
        System.out.println("Рыба-меч дышит под водой");
    }

    public void attack() {
        System.out.println("Рыба-меч атакует");
    }

    @Override
    public void showFishInfo() {
        move();
        breathe();
        attack();
    }

    public String getNoseSize() {
        return noseSize;
    }

    public void setNoseSize(String noseSize) {
        this.noseSize = noseSize;
    }
}
