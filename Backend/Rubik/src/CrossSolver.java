public class CrossSolver {
    private char[][][] cube;
    private CubeMoves cubeMoves;
    int count;
    char[] isVacant = new char[4];

    public CrossSolver(RubiksCube rubiksCube) {
        this.cube = rubiksCube.getCube(); // Directly assign the cube array to a member variable
        this.cubeMoves = new CubeMoves(rubiksCube); // Initialize CubeMoves with the RubiksCube instance
    }
    public void solveWhiteCross(){

    }

    private void checkWhiteOnTop(){
        if(cube[RubiksCube.TOP][0][1] == 'W'){
            count++;
            isVacant[0] = 'Y';
        }
        else{
            isVacant[0] = 'N';
        }
        if(cube[RubiksCube.TOP][1][0] == 'W'){
            count++;
            isVacant[1] = 'Y';
        }
        else{
            isVacant[1] = 'N';
        }
        if(cube[RubiksCube.TOP][1][2] == 'W'){
            count++;
            isVacant[2] = 'Y';
        }
        else{
            isVacant[2] = 'N';
        }
        if(cube[RubiksCube.TOP][2][1] == 'W'){
            count++;
            isVacant[3] = 'Y';
        }
        else{
            isVacant[3] = 'N';
        }
    }
    private void moveWhitesToTOP(){
        for(int face = 1; face < 5; face++){
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if((i==0&&(j==0||j==2))||((i==1)&&(j==1))||((i==2)&&(j==0||j==2))){
                        continue;
                    }
                    if(face==1){
                        if(cube[RubiksCube.FRONT][i][j] == 'W'){
                            if(i == 0){
                                if(isVacant[0] == 'N'){
                                    if(cube[RubiksCube.BOTTOM][1][0] != 'W') {
                                        cubeMoves.rotateFrontCounterClockwise();
                                        cubeMoves.rotateTopCounterClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateFrontClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][0][1] != 'W'){
                                        cubeMoves.rotateBottomCounterClockwise();
                                        cubeMoves.rotateFrontCounterClockwise();
                                        cubeMoves.rotateTopCounterClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateFrontClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][1][2] != 'W'){
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateFrontCounterClockwise();
                                        cubeMoves.rotateTopCounterClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateFrontClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][2][1] != 'W'){
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateFrontCounterClockwise();
                                        cubeMoves.rotateTopCounterClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateFrontClockwise();
                                    }
                                    isVacant[0] = 'Y';
                                }
                                else if(isVacant[1] == 'N') {
                                    if(cube[RubiksCube.BOTTOM][1][0] != 'W') {
                                        cubeMoves.rotateFrontCounterClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateFrontClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][0][1] != 'W'){
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateFrontCounterClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateFrontClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][1][2] != 'W'){
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateFrontCounterClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateFrontClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][2][1] != 'W'){
                                        cubeMoves.rotateBottomCounterClockwise();
                                        cubeMoves.rotateFrontCounterClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateFrontClockwise();
                                    }
                                    isVacant[1] = 'Y';
                                }
                                else if(isVacant[2] == 'N') {
                                    if(cube[RubiksCube.BOTTOM][1][2] != 'W'){
                                        cubeMoves.rotateFrontClockwise();
                                        cubeMoves.rotateRightClockwise();
                                        cubeMoves.rotateFrontCounterClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][0][1] != 'W'){
                                        cubeMoves.rotateBottomCounterClockwise();
                                        cubeMoves.rotateFrontClockwise();
                                        cubeMoves.rotateRightClockwise();
                                        cubeMoves.rotateFrontCounterClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][1][0] != 'W'){
                                        cubeMoves.rotateBottomCounterClockwise();
                                        cubeMoves.rotateBottomCounterClockwise();
                                        cubeMoves.rotateFrontClockwise();
                                        cubeMoves.rotateRightClockwise();
                                        cubeMoves.rotateFrontCounterClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][2][1] != 'W'){
                                    cubeMoves.rotateBottomClockwise();
                                    cubeMoves.rotateFrontClockwise();
                                    cubeMoves.rotateRightClockwise();
                                    cubeMoves.rotateFrontCounterClockwise();
                                    }
                                    isVacant[2] = 'Y';
                                }
                                else if(isVacant[3] == 'N') {
                                    cubeMoves.rotateFrontClockwise();
                                    cubeMoves.rotateTopCounterClockwise();
                                    cubeMoves.rotateRightClockwise();
                                    cubeMoves.rotateTopClockwise();
                                    isVacant[3] = 'Y';
                                }
                            }
                            else if(i == 1 && j == 0){
                                if(isVacant[0] == 'N') {
                                    if(cube[RubiksCube.BOTTOM][1][0] != 'W') {
                                        cubeMoves.rotateTopCounterClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][0][1] != 'W') {
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateTopCounterClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][1][2] != 'W') {
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateTopCounterClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][2][1] != 'W') {
                                        cubeMoves.rotateBottomCounterClockwise();
                                        cubeMoves.rotateTopCounterClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                    }
                                    isVacant[0] = 'Y';
                                }
                                else if(isVacant[1] == 'N'){
                                    if(cube[RubiksCube.BOTTOM][1][0] != 'W') {
                                        cubeMoves.rotateLeftCounterClockwise();
                                    }
                                    else if (cube[RubiksCube.BOTTOM][0][1] != 'W') {
                                        cubeMoves.rotateBottomCounterClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                    }
                                    else if (cube[RubiksCube.BOTTOM][1][2] !='W'){
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                    }
                                    else if (cube[RubiksCube.BOTTOM][2][1] != 'W'){
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                    }
                                    isVacant[1] = 'Y';
                                }
                                else if(isVacant[2] == 'N'){
                                    if(cube[RubiksCube.BOTTOM][1][0] != 'W') {
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateTopClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][0][1] != 'W') {
                                        cubeMoves.rotateBottomCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateTopClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][1][2] != 'W') {
                                        cubeMoves.rotateBottomCounterClockwise();
                                        cubeMoves.rotateBottomCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateTopClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][2][1] != 'W') {
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateTopClockwise();
                                    }
                                    isVacant[2] = 'Y';
                                }
                                else if(isVacant[3] == 'N'){
                                    cubeMoves.rotateTopClockwise();
                                    cubeMoves.rotateLeftCounterClockwise();
                                    cubeMoves.rotateTopCounterClockwise();
                                    isVacant[3] = 'Y';
                                }
                            }
                            else if(j == 2){
                                if (isVacant[0] == 'N'){
                                    if (cube[RubiksCube.BOTTOM][1][2] != 'W') {
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateRightClockwise();
                                        cubeMoves.rotateTopCounterClockwise();
                                    }
                                    else if (cube[RubiksCube.BOTTOM][0][1] != 'W'){
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateRightClockwise();
                                        cubeMoves.rotateTopCounterClockwise();
                                    }
                                    else if (cube[RubiksCube.BOTTOM][1][0] != 'W'){
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateRightClockwise();
                                        cubeMoves.rotateTopCounterClockwise();
                                    }
                                    else if (cube[RubiksCube.BOTTOM][2][1] != 'W'){
                                        cubeMoves.rotateBottomCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateRightClockwise();
                                        cubeMoves.rotateTopCounterClockwise();
                                    }
                                    isVacant[0] = 'Y';
                                }
                                else if(isVacant[1] == 'N'){
                                    if (cube[RubiksCube.BOTTOM][1][2] != 'W') {
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateRightClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateTopClockwise();
                                    }
                                    else if (cube[RubiksCube.BOTTOM][0][1] != 'W'){
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateRightClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateTopClockwise();
                                    }
                                    else if (cube[RubiksCube.BOTTOM][1][0] != 'W'){
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateRightClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateTopClockwise();
                                    }
                                    else if (cube[RubiksCube.BOTTOM][2][1] != 'W'){
                                        cubeMoves.rotateBottomCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateRightClockwise();
                                        cubeMoves.rotateTopClockwise();
                                        cubeMoves.rotateTopClockwise();
                                    }
                                    isVacant[1] = 'Y';
                                }
                                else if (isVacant[2] == 'N'){
                                    if (cube[RubiksCube.BOTTOM][1][2] != 'W') {
                                        cubeMoves.rotateRightClockwise();
                                    }
                                    else if (cube[RubiksCube.BOTTOM][0][1] != 'W'){
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateRightClockwise();
                                    }
                                    else if (cube[RubiksCube.BOTTOM][1][0] != 'W'){
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateRightClockwise();
                                    }
                                    else if (cube[RubiksCube.BOTTOM][2][1] != 'W'){
                                        cubeMoves.rotateBottomCounterClockwise();
                                        cubeMoves.rotateRightClockwise();
                                    }
                                    isVacant[2] = 'Y';
                                }
                                else if (isVacant[3] == 'N'){
                                    cubeMoves.rotateTopCounterClockwise();
                                    cubeMoves.rotateRightClockwise();
                                    cubeMoves.rotateTopClockwise();
                                    isVacant[3] = 'Y';
                                }
                            }
                            else {
                                if (isVacant[0] == 'N'){
                                    if (cube[RubiksCube.BOTTOM][1][0] == 'W' && cube[RubiksCube.BOTTOM][1][2] == 'W' && cube[RubiksCube.BOTTOM][2][1] == 'W'){
                                    cubeMoves.rotateFrontClockwise();
                                    cubeMoves.rotateTopCounterClockwise();
                                    cubeMoves.rotateBottomCounterClockwise();
                                    cubeMoves.rotateLeftCounterClockwise();
                                    cubeMoves.rotateTopClockwise();
                                    }
                                    else if (cube[RubiksCube.BOTTOM][1][0] != 'W'){
                                        cubeMoves.rotateFrontClockwise();
                                        cubeMoves.rotateTopCounterClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                    }
                                    else if (cube[RubiksCube.BOTTOM][2][1] != 'W'){
                                        cubeMoves.rotateFrontClockwise();
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateTopCounterClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                    }
                                    else {
                                        cubeMoves.rotateFrontClockwise();
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateTopCounterClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                        cubeMoves.rotateTopClockwise();
                                    }
                                    isVacant[0] = 'Y';
                                }
                                else if(isVacant[1] == 'N'){
                                    if(cube[RubiksCube.BOTTOM][1][0] != 'W'){
                                        cubeMoves.rotateFrontClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][1][2] != 'W'){
                                        cubeMoves.rotateFrontClockwise();
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][2][1] != 'W'){
                                        cubeMoves.rotateFrontClockwise();
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateLeftCounterClockwise();
                                    }
                                    isVacant[1] = 'Y';
                                }
                                else if(isVacant[2] == 'N'){
                                    if(cube[RubiksCube.BOTTOM][1][2] != 'W'){
                                        cubeMoves.rotateFrontCounterClockwise();
                                        cubeMoves.rotateRightClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][1][0] != 'W'){
                                        cubeMoves.rotateFrontCounterClockwise();
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateBottomClockwise();
                                        cubeMoves.rotateRightClockwise();
                                    }
                                    else if(cube[RubiksCube.BOTTOM][2][1] != 'W'){
                                        cubeMoves.rotateFrontCounterClockwise();
                                        cubeMoves.rotateBottomCounterClockwise();
                                        cubeMoves.rotateRightClockwise();
                                    }
                                    isVacant[2] = 'Y';
                                }
                                else if(isVacant[3] == 'N'){
                                    cubeMoves.rotateFrontCounterClockwise();
                                    cubeMoves.rotateTopCounterClockwise();
                                    cubeMoves.rotateRightClockwise();
                                    cubeMoves.rotateTopClockwise();
                                    isVacant[3] = 'Y';
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
