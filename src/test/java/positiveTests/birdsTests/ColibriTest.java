package positiveTests.birdsTests;

import academy.belhard.birds.Colibri;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ColibriTest {
    private final String ACTUAL_BIRD_TYPE = "Колибри";
    private final String ACTUAL_FLIGHT_SPEED = "скоростная";
    private final String EXPECTED_BIRD_TYPE = "Колибри";
    private final String EXPECTED_FLIGHT_SPEED = "скоростная";

    @Test(groups = "positive")
    public void birdTypeTest() {
        Colibri colibri = new Colibri(ACTUAL_BIRD_TYPE, ACTUAL_FLIGHT_SPEED);
        Assert.assertEquals(
                colibri.getBirdType(),
                EXPECTED_BIRD_TYPE,
                String.format("Актуальный тип птицы: %s", colibri.getBirdType())
        );
    }

    @Test(groups = "positive")
    public void colibriFlightSpeedTest() {
        Colibri colibri = new Colibri(ACTUAL_BIRD_TYPE, ACTUAL_FLIGHT_SPEED);
        Assert.assertEquals(
                colibri.getFlghtSpeed(),
                EXPECTED_FLIGHT_SPEED,
                String.format("Какая по скорости: %s", colibri.getFlghtSpeed())
        );
    }
}
