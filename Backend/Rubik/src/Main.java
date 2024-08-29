public class Main {
    public static void main(String[] args) {
        RubiksCube cube = new RubiksCube();
        CubeMoves moves = new CubeMoves(cube);

/*
        moves.rotateTopClockwise();
        moves.rotateRightClockwise();
        moves.rotateLeftClockwise();
        moves.rotateFrontCounterClockwise();
        moves.rotateRightCounterClockwise();
        moves.rotateTopCounterClockwise();

 */



        cube.DisplayCube();
    }
}