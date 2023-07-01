package positiveTests.animalsTests;

import org.belhard.animals.Lion;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LionTest {
    private final String ACTUAL_ANIMAL_TYPE = "Лев";
    private final String ACTUAL_ANIMAL_MANE = "гривастый";
    private final String EXPECTED_ANIMAL_TYPE = "Лев";
    private final String EXPECTED_ANIMAL_MANE = "гривастый";

    @Test(groups = "positive")
    public void animalTypeTest() {
        Lion lion = new Lion(ACTUAL_ANIMAL_TYPE, ACTUAL_ANIMAL_MANE);
        Assert.assertEquals(
                lion.getAnimalType(),
                EXPECTED_ANIMAL_TYPE,
                String.format("Актуальный тип животного: %s", lion.getAnimalType())
        );
    }

    @Test(groups = "positive")
    public void lionHasManeTest() {
        Lion lion = new Lion(ACTUAL_ANIMAL_TYPE, ACTUAL_ANIMAL_MANE);
        Assert.assertEquals(
                lion.getMane(),
                EXPECTED_ANIMAL_MANE,
                String.format("Наличие гривы: %s", lion.getMane())
        );
    }
}
