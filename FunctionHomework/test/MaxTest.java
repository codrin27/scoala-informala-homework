

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxTest {
    Max m = new Max();

    @Test
    void getMax() {
        int res = m.getMax(2, 3);
        Assertions.assertEquals(res,3);
    }

    @Test
    public void getMaxEquals() {
        Assertions.assertEquals(m.getMax(3, 3), 3);
    }
    @Test
    public void getMaxNegative(){
        Assertions.assertEquals(m.getMax(-1,-4),-1);
    }
}