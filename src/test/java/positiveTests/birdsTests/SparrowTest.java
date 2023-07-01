package positiveTests.birdsTests;

import academy.belhard.birds.Sparrow;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SparrowTest {
    private final String ACTUAL_BIRD_TYPE = "Воробей";
    private final String ACTUAL_FEATHER_COLOR = "сизый";
    private final String EXPECTED_BIRD_TYPE = "Воробей";
    private final String EXPECTED_FEATHER_COLOR = "сизый";

    @Test(groups = "positive")
    public void birdTypeTest() {
        Sparrow sparrow = new Sparrow(ACTUAL_BIRD_TYPE, ACTUAL_FEATHER_COLOR);
        Assert.assertEquals(
                sparrow.getBirdType(),
                EXPECTED_BIRD_TYPE,
                String.format("Актуальный тип птицы: %s", sparrow.getBirdType())
        );
    }

    @Test(groups = "positive")
    public void sparrowFeatherColorTest() {
        Sparrow sparrow = new Sparrow(ACTUAL_BIRD_TYPE, ACTUAL_FEATHER_COLOR);
        Assert.assertEquals(
                sparrow.getFeatherColor(),
                EXPECTED_FEATHER_COLOR,
                String.format("Цвет перьев: %s", sparrow.getFeatherColor())
        );
    }

}
