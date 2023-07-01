package positiveTests.mainMethodsTests;

import academy.belhard.animals.Animal;
import academy.belhard.animals.Lion;
import academy.belhard.animals.Panther;
import academy.belhard.animals.Tiger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowAnimalTest {
    private static final String EXPECTED_ANIMAL = "Тигр";
    private static final int ANIMAL_NUM = 1;
    private static final List<Animal> LIST_OF_ANIMALS = new ArrayList<>();

    Tiger tiger = new Tiger("Тигр", "полосатый");
    Lion lion = new Lion("Лев", "гривастый");
    Panther panther = new Panther("Пантера", "чёрная");

    public static Animal showAnimal() {
        Scanner scanner = new Scanner(String.valueOf(ANIMAL_NUM));
        int enteredNum;
        Animal currentAnimal = null;
        if (scanner.hasNextInt()) {
            enteredNum = scanner.nextInt() - 1;

            if (enteredNum < 0 || enteredNum >= LIST_OF_ANIMALS.size()) {
                System.out.println("Животного под таким номером не существует");
            }

            for (int i = 0; i < LIST_OF_ANIMALS.size(); i++) {
                if (i == enteredNum) {
                    currentAnimal = LIST_OF_ANIMALS.get(enteredNum);
                    currentAnimal.showAnimalInfo();
                }
            }

        }
        return currentAnimal;
    }

    @Test(groups = "positive")
    public void isRightFishTest() {
        LIST_OF_ANIMALS.add(tiger);
        LIST_OF_ANIMALS.add(lion);
        LIST_OF_ANIMALS.add(panther);

        Assert.assertEquals(
                showAnimal().getAnimalType(), EXPECTED_ANIMAL
        );
    }

}
