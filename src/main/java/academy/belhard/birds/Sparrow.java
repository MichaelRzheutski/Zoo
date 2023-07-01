package academy.belhard.birds;

public class Sparrow extends Bird {
    private String featherColor;

    public Sparrow(String birdType, String featherColor) {
        super(birdType);
        this.featherColor = featherColor;
    }

    @Override
    public void move() {
        System.out.println("Воробей летает");
    }

    @Override
    public void breathe() {
        System.out.println("Воробей дышит воздухом");
    }
    public void gathering() {
        System.out.println("Воробей собирается в стаю с другими воробьями");
    }

    @Override
    public void showBirdInfo() {
        move();
        breathe();
        gathering();
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
}
