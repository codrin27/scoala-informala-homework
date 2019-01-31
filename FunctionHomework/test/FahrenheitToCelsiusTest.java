

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FahrenheitToCelsiusTest {
    FahrenheitToCelsius v = new FahrenheitToCelsius();

    @Test
    void change() {
        double temp = v.change(97.7);
        Assertions.assertEquals(temp,36.5);
        temp = v.change(-40);
        Assertions.assertEquals(temp,-40);
    }
}