package positiveTests.birdsTests;

import academy.belhard.birds.Parrot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParrotTest {
    private final String ACTUAL_BIRD_TYPE = "Попугай";
    private final String ACTUAL_FEATHER_COLOR = "цветастый";
    private final String EXPECTED_BIRD_TYPE = "Попугай";
    private final String EXPECTED_FEATHER_COLOR = "цветастый";

    @Test(groups = "positive")
    public void birdTypeTest() {
        Parrot parrot = new Parrot(ACTUAL_BIRD_TYPE, ACTUAL_FEATHER_COLOR);
        Assert.assertEquals(
                parrot.getBirdType(),
                EXPECTED_BIRD_TYPE,
                String.format("Актуальный тип птицы: %s", parrot.getBirdType())
        );
    }

    @Test(groups = "positive")
    public void parrotFeatherColorTest() {
        Parrot parrot = new Parrot(ACTUAL_BIRD_TYPE, ACTUAL_FEATHER_COLOR);
        Assert.assertEquals(
                parrot.getFeatherColor(),
                EXPECTED_FEATHER_COLOR,
                String.format("Цвет перьев: %s", parrot.getFeatherColor())
        );
    }
}
