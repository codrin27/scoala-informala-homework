

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidationTest {

    @Test
    void valid() {
        int a = 0;
        int b = 0;
        Assertions.assertFalse(!Validation.valid(a,b));
    }
    @Test
    void validSad(){
        //Hours bad
        Assertions.assertFalse(Validation.valid(24,0));
        //Minutes bad
        Assertions.assertFalse(Validation.valid(23,60));
        //Both bad
        Assertions.assertFalse(Validation.valid(24,60));
    }
}