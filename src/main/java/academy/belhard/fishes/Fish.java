package academy.belhard.fishes;

public abstract class Fish {
    String fishType;

    public Fish(String fishType) {
        this.fishType = fishType;
    }

    public abstract void move();
    public abstract void breathe();
    public abstract void showFishInfo();

    public String getFishType() {
        return fishType;
    }

    public void setFishType(String fishType) {
        this.fishType = fishType;
    }
}
