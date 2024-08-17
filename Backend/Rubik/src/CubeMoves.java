import java.rmi.server.RemoteRef;
import java.util.Arrays;

public class CubeMoves {
    private RubiksCube rubiksCube; // Instance of RubiksCube
    private char[][][] cube;


    // Constructor to initialize the CubeMoves with a RubiksCube instance
    public CubeMoves(RubiksCube rubiksCube) {
        this.rubiksCube = rubiksCube;   // Assign the passed RubiksCube to the instance variable
        this.cube = rubiksCube.getCube(); // Initialize the cube array using the getter method
    }

    public void rotateTopClockwise(){
        char temp = cube[RubiksCube.TOP][0][0];
        cube[RubiksCube.TOP][0][0] = cube[RubiksCube.TOP][2][0];
        cube[RubiksCube.TOP][2][0] = cube[RubiksCube.TOP][2][2];
        cube[RubiksCube.TOP][2][2] = cube[RubiksCube.TOP][0][2];
        cube[RubiksCube.TOP][0][2] = temp;

        temp = cube[RubiksCube.TOP][0][1];
        cube[RubiksCube.TOP][0][1] = cube[RubiksCube.TOP][1][0];
        cube[RubiksCube.TOP][1][0] = cube[RubiksCube.TOP][2][1];
        cube[RubiksCube.TOP][2][1] = cube[RubiksCube.TOP][1][2];
        cube[RubiksCube.TOP][1][2] = temp;

        char[] tempRow = new char[3];
        System.arraycopy(cube[RubiksCube.FRONT][0], 0, tempRow, 0, 3);
        System.arraycopy(cube[RubiksCube.RIGHT][0], 0, cube[RubiksCube.FRONT][0], 0, 3 );
        System.arraycopy(cube[RubiksCube.BACK][0], 0, cube[RubiksCube.RIGHT][0], 0, 3);
        System.arraycopy(cube[RubiksCube.LEFT][0],0, cube[RubiksCube.BACK][0],0,3);
        System.arraycopy(tempRow, 0, cube[RubiksCube.LEFT][0], 0, 3);
    }



    public void rotateTopCounterClockwise(){
        char temp = cube[RubiksCube.TOP][0][0];
        cube[RubiksCube.TOP][0][0] = cube[RubiksCube.TOP][0][2];
        cube[RubiksCube.TOP][0][2] = cube[RubiksCube.TOP][2][2];
        cube[RubiksCube.TOP][2][2] = cube[RubiksCube.TOP][2][0];
        cube[RubiksCube.TOP][2][0] = temp;

        temp = cube[RubiksCube.TOP][0][1];
        cube[RubiksCube.TOP][0][1] = cube[RubiksCube.TOP][1][2];
        cube[RubiksCube.TOP][1][2] = cube[RubiksCube.TOP][2][1];
        cube[RubiksCube.TOP][2][1] =cube[RubiksCube.TOP][1][0];
        cube[RubiksCube.TOP][1][0] = temp;

        char[] tempRow = new char[3];
        System.arraycopy(cube[RubiksCube.FRONT][0], 0, tempRow, 0, 3);
        System.arraycopy(cube[RubiksCube.LEFT][0],0, cube[RubiksCube.FRONT][0], 0, 3);
        System.arraycopy(cube[RubiksCube.BACK][0], 0, cube[RubiksCube.LEFT][0], 0, 3);
        System.arraycopy(cube[RubiksCube.RIGHT][0], 0, cube[RubiksCube.BACK][0], 0, 3);
        System.arraycopy(tempRow, 0, cube[RubiksCube.RIGHT][0], 0, 3);
    }

    public void rotateFrontClockwise(){

        char temp = cube[RubiksCube.FRONT][0][0];
        cube[RubiksCube.FRONT][0][0] = cube[RubiksCube.FRONT][2][0];
        cube[RubiksCube.FRONT][2][0] = cube[RubiksCube.FRONT][2][2];
        cube[RubiksCube.FRONT][2][2] = cube[RubiksCube.FRONT][0][2];
        cube[RubiksCube.FRONT][0][2] = temp;

        temp = cube[RubiksCube.FRONT][0][1];
        cube[RubiksCube.FRONT][0][1] = cube[RubiksCube.FRONT][1][0];
        cube[RubiksCube.FRONT][1][0] = cube[RubiksCube.FRONT][2][1];
        cube[RubiksCube.FRONT][2][1] = cube[RubiksCube.FRONT][1][2];
        cube[RubiksCube.FRONT][1][2] = temp;

        char [] tempRow = new char[3];
        System.arraycopy(cube[RubiksCube.TOP][2], 0, tempRow, 0, 3);
        for(int i = 0; i < 3; i++){
            cube[RubiksCube.TOP][2][i] = cube[RubiksCube.LEFT][2-i][2];
        }
        for(int i = 0; i < 3; i++){
            cube[RubiksCube.LEFT][i][2] = cube[RubiksCube.BOTTOM][0][i];
        }
        for(int i = 0; i < 3; i++){
            cube[RubiksCube.BOTTOM][0][i] = cube[RubiksCube.RIGHT][2-i][0];
        }
        for(int i = 0; i < 3; i++){
            cube[RubiksCube.RIGHT][i][0] = tempRow[i];
        }
        System.arraycopy(cube[RubiksCube.TOP][2], 0, cube[RubiksCube.RIGHT][0], 0, 3);
        System.arraycopy(cube[RubiksCube.LEFT][0], 0, cube[RubiksCube.TOP][0], 0, 3);
        System.arraycopy(tempRow, 0, cube[RubiksCube.LEFT][0], 0, 3);
    }

    public void rotateFrontCounterClockwise(){
        char temp = cube[RubiksCube.FRONT][0][0];
        cube[RubiksCube.FRONT][0][0] = cube[RubiksCube.FRONT][0][2];
        cube[RubiksCube.FRONT][0][2] = cube[RubiksCube.FRONT][2][2];
        cube[RubiksCube.FRONT][2][2] = cube[RubiksCube.FRONT][2][0];
        cube[RubiksCube.FRONT][2][0] = temp;

        temp = cube[RubiksCube.FRONT][0][1];
        cube[RubiksCube.FRONT][0][1] = cube[RubiksCube.FRONT][1][2];
        cube[RubiksCube.FRONT][1][2] = cube[RubiksCube.FRONT][2][1];
        cube[RubiksCube.FRONT][2][1] = cube[RubiksCube.FRONT][1][0];
        cube[RubiksCube.FRONT][1][0] = temp;

        char[] tempRow = new char[3];
        System.arraycopy(cube[RubiksCube.BOTTOM][0], 0, tempRow, 0, 3);
        System.arraycopy(cube[RubiksCube.LEFT][0], 0, cube[RubiksCube.BOTTOM][0], 0, 3);
        System.arraycopy(cube[RubiksCube.TOP][0], 0, cube[RubiksCube.LEFT][0], 0, 3);
        System.arraycopy(cube[RubiksCube.RIGHT][0], 0, cube[RubiksCube.TOP][0], 0, 3);
        System.arraycopy(tempRow, 0, cube[RubiksCube.RIGHT][0], 0, 3);

    }
}