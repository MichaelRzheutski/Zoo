package positiveTests.mainMethodsTests;

import academy.belhard.fishes.Fish;
import academy.belhard.fishes.Shark;
import academy.belhard.fishes.SwordFish;
import academy.belhard.fishes.Whale;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ShowAllFishesTest {
    private static final int EXPECTED_QUANTITY_OF_FISHES = 3;
    private static final List<Fish> LIST_OF_FISHES = new ArrayList<>();
    static int fishCounter = 1;

    Shark shark = new Shark("Акула", "зубастая");
    Whale whale = new Whale("Кит", "огромный");
    SwordFish swordFish = new SwordFish("Рыба-меч", "длинноносая");

    public static int showAllFishes() {
        System.out.println("Рыбы:");
        for (Fish fish : LIST_OF_FISHES) {
            System.out.println(fishCounter + ". " + fish.getFishType());
            fishCounter++;
        }
        System.out.println();

        return fishCounter - 1;
    }

    @Test(groups = "positive")
    public void quantityOfBirdsTest() {
        LIST_OF_FISHES.add(shark);
        LIST_OF_FISHES.add(whale);
        LIST_OF_FISHES.add(swordFish);

        Assert.assertEquals(
                showAllFishes(), EXPECTED_QUANTITY_OF_FISHES
        );
    }

}
