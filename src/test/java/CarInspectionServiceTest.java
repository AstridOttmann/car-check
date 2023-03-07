import org.example.Car;
import org.example.CarInspectionService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarInspectionServiceTest {
    private final CarInspectionService carInspectionService = new CarInspectionService();

    @Test
    void whenCarHas4TiresReturnTrue() {
        Car testCar = new Car(4, 3, true, true);
        boolean actual = carInspectionService.checkTires(testCar);
        assertTrue(actual);
    }

    @Test
    void whenCarHasNot4TiresReturnFalse() {
        Car testCar2 = new Car(3, 3, true, true);
        boolean actual = carInspectionService.checkTires(testCar2);
        assertFalse(actual);
    }

    @Test
    void whenCarHasSeatBeltReturnTrue() {
        Car testCar = new Car(3, 3, true, true);
        boolean actual = carInspectionService.checkSeatBelt(testCar);
        assertTrue(actual);
    }

    @Test
    void whenCarHasNoSeatBeltReturnFalse() {
        Car testCar = new Car(3, 3, false, false);
        boolean actual = carInspectionService.checkSeatBelt(testCar);
        assertFalse(actual);
    }
    @Test
    void whenCarHasAirbagReturnTrue() {
        Car testCar = new Car(4, 3, true, true);
        boolean actual = carInspectionService.checkAirbag(testCar);
        assertTrue(actual);
    }

    @Test
    void whenCarHasNoAirbagReturnFalse() {
        Car testCar = new Car(4, 3, false, false);
        boolean actual = carInspectionService.checkAirbag(testCar);
        assertFalse(actual);
    }
}
