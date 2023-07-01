package positiveTests.mainMethodsTests;

import academy.belhard.animals.Animal;
import academy.belhard.animals.Lion;
import academy.belhard.animals.Panther;
import academy.belhard.animals.Tiger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ShowAllAnimalsTest {
    private static final int EXPECTED_QUANTITY_OF_ANIMALS = 3;
    private static final List<Animal> LIST_OF_ANIMALS = new ArrayList<>();
    static int animalCounter = 1;

    Tiger tiger = new Tiger("Тигр", "полосатый");
    Lion lion = new Lion("Лев", "гривастый");
    Panther panther = new Panther("Пантера", "чёрная");

    public static int showAllAnimals() {
        System.out.println("Животные:");
        for (Animal animal : LIST_OF_ANIMALS) {
            System.out.println(animalCounter + ". " + animal.getAnimalType());
            animalCounter++;
        }
        System.out.println();

        return animalCounter - 1;
    }

    @Test(groups = "positive")
    public void quantityOfAnimalsTest() {
        LIST_OF_ANIMALS.add(tiger);
        LIST_OF_ANIMALS.add(lion);
        LIST_OF_ANIMALS.add(panther);

        Assert.assertEquals(
                showAllAnimals(), EXPECTED_QUANTITY_OF_ANIMALS
        );
    }

}
