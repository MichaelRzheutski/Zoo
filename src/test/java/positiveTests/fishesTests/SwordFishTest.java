package positiveTests.fishesTests;

import academy.belhard.fishes.SwordFish;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwordFishTest {
    private final String ACTUAL_FISH_TYPE = "Рыба-меч";
    private final String ACTUAL_NOSE_SIZE = "длинноносая";
    private final String EXPECTED_FISH_TYPE = "Рыба-меч";
    private final String EXPECTED_NOSE_SIZE = "длинноносая";

    @Test(groups = "positive")
    public void fishTypeTest() {
        SwordFish swordFish = new SwordFish(ACTUAL_FISH_TYPE, ACTUAL_NOSE_SIZE);
        Assert.assertEquals(
                swordFish.getFishType(),
                EXPECTED_FISH_TYPE,
                String.format("Актуальный тип рыбы: %s", swordFish.getFishType())
        );
    }

    @Test(groups = "positive")
    public void swordFishNoseSizeTest() {
        SwordFish swordFish = new SwordFish(ACTUAL_FISH_TYPE, ACTUAL_NOSE_SIZE);
        Assert.assertEquals(
                swordFish.getNoseSize(),
                EXPECTED_NOSE_SIZE,
                String.format("Размер носа: %s", swordFish.getNoseSize())
        );
    }
}
