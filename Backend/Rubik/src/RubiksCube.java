public class RubiksCube {
    private final char[][][] cube = new char[6][3][3];        //Cube face array initiation 3-D where[face][grid face][grid face]
    private static final char [] colors = {'Y', 'G', 'O', 'B', 'R', 'W'};
    private static final String [] faceNames = {"Top", "Front", "Left", "Back", "Right", "Bottom"};
    public static final int TOP = 0; //Representing cube faces
    public static final int FRONT = 1;
    public static final int LEFT = 2;
    public static final int BACK = 3;
    public static final int RIGHT = 4;
    public static final int BOTTOM = 5;// Cube array

    public char[][][] getCube() {
        return cube;
    }


    public RubiksCube (){  // Method to access the initialized cube
        initiateCube();
    }


    private void initiateCube(){
        for(int face = 0; face < 6; face++){
            for(int i = 0; i <3; i++){
                for(int j = 0; j <3; j++){
                    cube[face][i][j] = colors[face];
                }
            }
        }
    }


    public void DisplayCube(){
        for(int face = 0; face < 6; face++){
            System.out.println("Face: " + faceNames[face]);
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(cube[face][i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
