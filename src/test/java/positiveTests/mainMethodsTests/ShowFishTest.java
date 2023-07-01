package positiveTests.mainMethodsTests;

import academy.belhard.fishes.Fish;
import academy.belhard.fishes.Shark;
import academy.belhard.fishes.SwordFish;
import academy.belhard.fishes.Whale;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowFishTest {
    private static final String EXPECTED_FISH = "Акула";
    private static final int FISH_NUM = 1;
    private static final List<Fish> LIST_OF_FISHES = new ArrayList<>();

    Shark shark = new Shark("Акула", "зубастая");
    Whale whale = new Whale("Кит", "огромный");
    SwordFish swordFish = new SwordFish("Рыба-меч", "длинноносая");

    public static Fish showFish() {
        Scanner scanner = new Scanner(String.valueOf(FISH_NUM));
        int enteredNum;
        Fish currentFish = null;
        if (scanner.hasNextInt()) {
            enteredNum = scanner.nextInt() - 1;

            if (enteredNum < 0 || enteredNum >= LIST_OF_FISHES.size()) {
                System.out.println("Рыбы под таким номером не существует");
            }

            for (int i = 0; i < LIST_OF_FISHES.size(); i++) {
                if (i == enteredNum) {
                    currentFish = LIST_OF_FISHES.get(enteredNum);
                    currentFish.showFishInfo();
                }
            }

        }
        return currentFish;
    }

    @Test(groups = "positive")
    public void isRightFishTest() {
        LIST_OF_FISHES.add(shark);
        LIST_OF_FISHES.add(whale);
        LIST_OF_FISHES.add(swordFish);

        Assert.assertEquals(
                showFish().getFishType(), EXPECTED_FISH
        );
    }

}
