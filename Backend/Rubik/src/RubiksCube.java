public class RubiksCube {
    private char[][] top = new char[3][3];      //Cube face array initiation Top: Yellow
    private char[][] bottom = new char[3][3];   //Cube face array initiation Bottom: White
    private char[][] left = new char[3][3];     //Cube face array initiation Left: Orange
    private char[][] right = new char[3][3];    //Cube face array initiation Right: Red
    private char[][] front = new char[3][3];    //Cube face array initiation Front: Green
    private char[][] back = new char[3][3];     //Cube face array initiation Back: Blue

    private void initiateCube(){

    }
    public RubiksCube (){  // Method to access the initialized cube
        initiateCube();
    }
}
