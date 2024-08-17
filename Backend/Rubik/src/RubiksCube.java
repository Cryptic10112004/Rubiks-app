public class RubiksCube {
    private char[][][] cube = new char[6][3][3];        //Cube face array initiation 3-D where[face][grid face][grid face]
    char [] colors = {'Y', 'W', 'O', 'R', 'G', 'B'};
    String [] faceNames = {"Top", "Bottom", "Left", "Right", "Front", "Back"};
    // Representation of faces
    private static final int TOP = 0;
    private static final int BOTTOM = 1;
    private static final int LEFT = 2;
    private static final int RIGHT = 3;
    private static final int FRONT = 4;
    private static final int BACK = 5;


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
