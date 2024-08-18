public class Main {
    public static void main(String[] args) {
        RubiksCube cube = new RubiksCube();
        CubeMoves moves = new CubeMoves(cube);
        moves.rotateFrontCounterClockwise();
        moves.rotateTopClockwise();
        moves.rotateTopCounterClockwise();
        moves.rotateFrontClockwise();
        moves.rotateBackClockwise();
        moves.rotateBackCounterClockwise();
        moves.rotateRightClockwise();
        moves.rotateRightCounterClockwise();
        moves.rotateLeftClockwise();
        moves.rotateLeftCounterClockwise();
        cube.DisplayCube();
    }
}