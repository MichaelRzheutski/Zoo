package academy.belhard.fishes;

public class Whale extends Fish {
    private String whaleSize;

    public Whale(String fishType, String whaleSize) {
        super(fishType);
        this.whaleSize = whaleSize;
    }

    @Override
    public void move() {
        System.out.println("Кит плавает в воде");
    }

    @Override
    public void breathe() {
        System.out.println("Кит дышит под водой");
    }

    public void fountain() {
        System.out.println("Кит фонтанирует");
    }

    @Override
    public void showFishInfo() {
        move();
        breathe();
        fountain();
    }

    public String getWhaleSize() {
        return whaleSize;
    }

    public void setWhaleSize(String whaleSize) {
        this.whaleSize = whaleSize;
    }
}
