package positiveTests.mainMethodsTests;

import academy.belhard.birds.Bird;
import academy.belhard.birds.Colibri;
import academy.belhard.birds.Parrot;
import academy.belhard.birds.Sparrow;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowBirdTest {
    private static final String EXPECTED_BIRD = "Попугай";
    private static final int BIRD_NUM = 1;
    private static final List<Bird> LIST_OF_BIRDS = new ArrayList<>();

    Parrot parrot = new Parrot("Попугай", "цветастый");
    Colibri colibri = new Colibri("Колибри", "скоростная");
    Sparrow sparrow = new Sparrow("Воробей", "сизый");

    public static Bird showBird() {
        Scanner scanner = new Scanner(String.valueOf(BIRD_NUM));
        int enteredNum;
        Bird currentBird = null;
        if (scanner.hasNextInt()) {
            enteredNum = scanner.nextInt() - 1;

            if (enteredNum < 0 || enteredNum >= LIST_OF_BIRDS.size()) {
                System.out.println("Птицы под таким номером не существует");
            }

            for (int i = 0; i < LIST_OF_BIRDS.size(); i++) {
                if (i == enteredNum) {
                    currentBird = LIST_OF_BIRDS.get(enteredNum);
                    currentBird.showBirdInfo();
                }
            }

        }
        return currentBird;
    }

    @Test(groups = "positive")
    public void isRightFishTest() {
        LIST_OF_BIRDS.add(parrot);
        LIST_OF_BIRDS.add(colibri);
        LIST_OF_BIRDS.add(sparrow);

        Assert.assertEquals(
                showBird().getBirdType(), EXPECTED_BIRD
        );
    }

}
