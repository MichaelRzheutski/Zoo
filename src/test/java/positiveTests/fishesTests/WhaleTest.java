package positiveTests.fishesTests;

import academy.belhard.fishes.Whale;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WhaleTest {
    private final String ACTUAL_FISH_TYPE = "Кит";
    private final String ACTUAL_WHALE_SIZE = "огромный";
    private final String EXPECTED_FISH_TYPE = "Кит";
    private final String EXPECTED_WHALE_SIZE = "огромный";

    @Test(groups = "positive")
    public void fishTypeTest() {
        Whale whale = new Whale(ACTUAL_FISH_TYPE, ACTUAL_WHALE_SIZE);
        Assert.assertEquals(
                whale.getFishType(),
                EXPECTED_FISH_TYPE,
                String.format("Актуальный тип рыбы: %s", whale.getFishType())
        );
    }

    @Test(groups = "positive")
    public void whaleSizeTest() {
        Whale whale = new Whale(ACTUAL_FISH_TYPE, ACTUAL_WHALE_SIZE);
        Assert.assertEquals(
                whale.getWhaleSize(),
                EXPECTED_WHALE_SIZE,
                String.format("Размер: %s", whale.getWhaleSize())
        );
    }
}
