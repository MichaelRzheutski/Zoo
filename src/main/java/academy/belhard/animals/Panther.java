package academy.belhard.animals;

public class Panther extends Animal {
    private String woolColor;

    public Panther(String animalType, String woolColor) {
        super(animalType);
        this.woolColor = woolColor;
    }

    @Override
    public void move() {
        System.out.println("Пантера бегает по суше и лазает по деревьям");
    }

    @Override
    public void breathe() {
        System.out.println("Пантера дышит воздухом");
    }

    public void climbTree() {
        System.out.println("Пантера залезает на дерево");
    }

    @Override
    public void showAnimalInfo() {
        move();
        breathe();
        climbTree();
    }

    public String getWoolColor() {
        return woolColor;
    }

    public void setWoolColor(String woolColor) {
        this.woolColor = woolColor;
    }

}
