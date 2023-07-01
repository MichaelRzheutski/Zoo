package positiveTests.animalsTests;

import academy.belhard.animals.Tiger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TigerTest {
    private final String ACTUAL_ANIMAL_TYPE = "Тигр";
    private final String ACTUAL_WOOL_TYPE = "полосатый";
    private final String EXPECTED_ANIMAL_TYPE = "Тигр";
    private final String EXPECTED_WOOL_TYPE = "полосатый";

    @Test(groups = "positive")
    public void animalTypeTest() {
        Tiger tiger = new Tiger(ACTUAL_ANIMAL_TYPE, ACTUAL_WOOL_TYPE);
        Assert.assertEquals(
                tiger.getAnimalType(),
                EXPECTED_ANIMAL_TYPE,
                String.format("Актуальный тип животного: %s", tiger.getAnimalType())
        );
    }

    @Test(groups = "positive")
    public void tigerWoolTypeTest() {
        Tiger tiger = new Tiger(ACTUAL_ANIMAL_TYPE, ACTUAL_WOOL_TYPE);
        Assert.assertEquals(
                tiger.getWoolType(),
                EXPECTED_WOOL_TYPE,
                String.format("Тип шерсти: %s", tiger.getWoolType())
        );
    }
}
