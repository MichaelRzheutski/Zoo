package positiveTests.fishesTests;

import academy.belhard.fishes.Shark;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SharkTest {
    private final String ACTUAL_FISH_TYPE = "Акула";
    private final String ACTUAL_TEETH_TYPE = "зубастая";
    private final String EXPECTED_FISH_TYPE = "Акула";
    private final String EXPECTED_TEETH_TYPE = "зубастая";

    @Test(groups = "positive")
    public void fishTypeTest() {
        Shark shark = new Shark(ACTUAL_FISH_TYPE, ACTUAL_TEETH_TYPE);
        Assert.assertEquals(
                shark.getFishType(),
                EXPECTED_FISH_TYPE,
                String.format("Актуальный тип рыбы: %s", shark.getFishType())
        );
    }

    @Test(groups = "positive")
    public void sharkTeethTypeTest() {
        Shark shark = new Shark(ACTUAL_FISH_TYPE, ACTUAL_TEETH_TYPE);
        Assert.assertEquals(
                shark.getTeethType(),
                EXPECTED_TEETH_TYPE,
                String.format("Тип зубов: %s", shark.getTeethType())
        );
    }
}
