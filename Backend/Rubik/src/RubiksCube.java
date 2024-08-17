public class RubiksCube {
    private char[][] top = new char[3][3];      //Cube face array initiation Top: Yellow
    private char[][] bottom = new char[3][3];   //Cube face array initiation Bottom: White
    private char[][] left = new char[3][3];     //Cube face array initiation Left: Orange
    private char[][] right = new char[3][3];    //Cube face array initiation Right: Red
    private char[][] front = new char[3][3];    //Cube face array initiation Front: Green
    private char[][] back = new char[3][3];     //Cube face array initiation Back: Blue

    private void initiateCube(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                top[i][j] = 'Y';
                bottom[i][j] = 'W';
                left[i][j] = 'O';
                right[i][j] = 'R';
                front[i][j] = 'G';
                back[i][j] = 'B';
            }
        }

    }
    public RubiksCube (){  // Method to access the initialized cube
        initiateCube();
    }
    public void DisplayCube(){
        System.out.println("Face: Top");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(top[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Face: Bottom");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(bottom[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Face: Left");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(left[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Face: Right");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(right[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Face: Front");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(front[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Face: Back");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(back[i][j] + " ");
            }
            System.out.println();
        }
    }
}
