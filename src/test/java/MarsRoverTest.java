import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    void test_moveForward() {
        MarsRover rover = new MarsRover(0, 0, 'N');
        rover.execute('M');
        assertEquals(Arrays.asList("0", "1", "N"), rover.report());
    }

    @Test
    void test_backForward() {
        MarsRover rover = new MarsRover(0, 0, 'N');
        rover.execute('B');
        assertEquals(Arrays.asList("0", "-1", "N"), rover.report());
    }

    @Test
    void test_turnRight() {
        MarsRover rover = new MarsRover(0, 0, 'N');
        rover.execute('R');
        assertEquals(Arrays.asList("0", "0", "E"), rover.report());
    }

    @Test
    void test_turnLeft() {
        MarsRover rover = new MarsRover(0, 0, 'N');
        rover.execute('L');
        assertEquals(Arrays.asList("0", "0", "W"), rover.report());
    }


}
