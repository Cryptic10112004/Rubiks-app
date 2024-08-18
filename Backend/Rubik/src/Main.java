public class Main {
    public static void main(String[] args) {
        RubiksCube cube = new RubiksCube();
        CubeMoves moves = new CubeMoves(cube);
        moves.rotateFrontCounterClockwise();
        moves.rotateTopClockwise();
        moves.rotateTopCounterClockwise();
        moves.rotateFrontClockwise();
        cube.DisplayCube();
    }
}