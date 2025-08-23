import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int x_position;
    private int y_position;
    private char direction;
    private ArrayList<Character> rightTurnList = new ArrayList<>(Arrays.asList('N', 'E', 'S', 'W'));
    private ArrayList<Character> leftTurnList = new ArrayList<>(Arrays.asList('N', 'W', 'S', 'E'));

    public MarsRover(int x_position, int y_position, char direction) {
        this.x_position = x_position;
        this.y_position = y_position;
        this.direction = direction;
    }
}
