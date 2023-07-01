package positiveTests.mainMethodsTests;

import academy.belhard.birds.Bird;
import academy.belhard.birds.Colibri;
import academy.belhard.birds.Parrot;
import academy.belhard.birds.Sparrow;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ShowAllBirdsTest {
    private static final int EXPECTED_QUANTITY_OF_BIRDS = 3;
    private static final List<Bird> LIST_OF_BIRDS = new ArrayList<>();
    static int birdCounter = 1;

    Parrot parrot = new Parrot("Попугай", "цветастый");
    Colibri colibri = new Colibri("Колибри", "скоростная");
    Sparrow sparrow = new Sparrow("Воробей", "сизый");

    public static int showAllBirds() {
        System.out.println("Птицы:");
        for (Bird bird : LIST_OF_BIRDS) {
            System.out.println(birdCounter + ". " + bird.getBirdType());
            birdCounter++;
        }
        System.out.println();

        return birdCounter - 1;
    }

    @Test(groups = "positive")
    public void quantityOfBirdsTest() {
        LIST_OF_BIRDS.add(parrot);
        LIST_OF_BIRDS.add(colibri);
        LIST_OF_BIRDS.add(sparrow);

        Assert.assertEquals(
                showAllBirds(), EXPECTED_QUANTITY_OF_BIRDS
        );
    }

}
