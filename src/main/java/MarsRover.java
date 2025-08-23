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

    public void execute(char command) {
        switch (command) {
            case 'M':
                if (direction == 'N') {
                    y_position += 1;
                }
                if (direction == 'S') {
                    y_position += -1;
                }
                if (direction == 'W') {
                    x_position += -1;
                }
                if (direction == 'E') {
                    x_position += 1;
                }
                break;

            case 'B':
                if (direction == 'N') {
                    y_position += -1;
                }
                if (direction == 'S') {
                    y_position += 1;
                }
                if (direction == 'W') {
                    x_position += 1;
                }
                if (direction == 'E') {
                    x_position += -1;
                }
                break;

            case 'L':
                direction = leftTurnList.get((leftTurnList.indexOf(direction) + 1) % 4);
                break;

            case 'R':
                direction = rightTurnList.get((rightTurnList.indexOf(direction) + 1) % 4);
        }

    }
    
    public List<String> report() {
        return Arrays.asList(String.valueOf(x_position), String.valueOf(y_position), String.valueOf(direction));
    }
}
