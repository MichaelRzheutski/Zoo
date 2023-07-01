package academy.belhard.birds;

public class Colibri extends Bird {
    private String flghtSpeed;

    public Colibri(String birdType, String flghtSpeed) {
        super(birdType);
        this.flghtSpeed = flghtSpeed;
    }

    @Override
    public void move() {
        System.out.println("Колибри летает");
    }

    @Override
    public void breathe() {
        System.out.println("Колибри дышит воздухом");
    }

    public void collectNectar() {
        System.out.println("Колибри собирает нектар");
    }

    @Override
    public void showBirdInfo() {
        move();
        breathe();
        collectNectar();
    }

    public String getFlghtSpeed() {
        return flghtSpeed;
    }

    public void setFlghtSpeed(String flghtSpeed) {
        this.flghtSpeed = flghtSpeed;
    }
}
