package positiveTests.animalsTests;

import academy.belhard.animals.Panther;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PantherTest {
    private final String ACTUAL_ANIMAL_TYPE = "Пантера";
    private final String ACTUAL_ANIMAL_COLOR = "чёрная";
    private final String EXPECTED_ANIMAL_TYPE = "Пантера";
    private final String EXPECTED_ANIMAL_COLOR = "чёрная";

    @Test(groups = "positive")
    public void animalTypeTest() {
        Panther panther = new Panther(ACTUAL_ANIMAL_TYPE, ACTUAL_ANIMAL_COLOR);
        Assert.assertEquals(
                panther.getAnimalType(),
                EXPECTED_ANIMAL_TYPE,
                String.format("Актуальный тип животного: %s", panther.getAnimalType())
        );
    }

    @Test(groups = "positive")
    public void pantherColorTest() {
        Panther panther = new Panther(ACTUAL_ANIMAL_TYPE, ACTUAL_ANIMAL_COLOR);
        Assert.assertEquals(
                panther.getWoolColor(),
                EXPECTED_ANIMAL_COLOR,
                String.format("Цвет: %s", panther.getWoolColor())
        );
    }
}
