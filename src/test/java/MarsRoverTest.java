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

    @Test
     void test_position_face_north() {
        MarsRover rover = new MarsRover(10, 20, 'N');
        rover.execute('M');
        assertEquals(Arrays.asList("10", "21", "N"), rover.report());
    }

    @Test
    void test_position_face_west() {
        MarsRover rover = new MarsRover(10, 20, 'W');
        rover.execute('M');
        assertEquals(Arrays.asList("9", "20", "W"), rover.report());
    }

    @Test
    void test_position_turn_left() {
        MarsRover rover = new MarsRover(10, 20, 'W');
        rover.execute('L');
        assertEquals(Arrays.asList("10", "20", "S"), rover.report());
    }

    @Test
    void test_position_turn_right() {
        MarsRover rover = new MarsRover(10, 20, 'W');
        rover.execute('R');
        assertEquals(Arrays.asList("10", "20", "N"), rover.report());
    }

    @Test
    void test_position_execute_two_times_move() {
        MarsRover rover = new MarsRover(10, 20, 'N');
        rover.execute('M');
        rover.execute('M');
        assertEquals(Arrays.asList("10", "22", "N"), rover.report());
    }

    @Test
    void test_position_execute_two_times_back() {
        MarsRover rover = new MarsRover(10, 20, 'N');
        rover.execute('B');
        rover.execute('B');
        assertEquals(Arrays.asList("10", "18", "N"), rover.report());
    }

    @Test
    void test_position_execute_two_times_move_back() {
        MarsRover rover = new MarsRover(10, 20, 'N');
        rover.execute('M');
        rover.execute('B');
        assertEquals(Arrays.asList("10", "20", "N"), rover.report());
    }


}
