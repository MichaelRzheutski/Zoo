package academy.belhard.birds;

public class Parrot extends Bird {
    private String featherColor;

    public Parrot(String birdType, String featherColor) {
        super(birdType);
        this.featherColor = featherColor;
    }

    @Override
    public void move() {
        System.out.println("Попугай летает");
    }

    @Override
    public void breathe() {
        System.out.println("Попугай дышит воздухом");
    }

    public void repeating() {
        System.out.println("Попугай повторяет слова");
    }

    @Override
    public void showBirdInfo() {
        move();
        breathe();
        repeating();
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
}
