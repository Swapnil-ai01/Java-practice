import java.util.Scanner;
class Task14 {
    private static int[][] write(Scanner sc) {
        int[][] matrx = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrx[i][j] = sc.nextInt();
            }
        }
        return matrx;
    }
    public static void read(int[][] matrx) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrx[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] Sum(int[][] matrxA, int[][] matrxB){
        int[][] matrxSum = new int[3][3];
        for(int i = 0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                matrxSum[i][j] = matrxA[i][j] + matrxB[i][j];
            }
        }
        return matrxSum;
    }
    public static int[][] mult(int[][] matrxA,int[][] matrxB){
        int[][] matrxMult = new int[3][3];

        for(int i = 0; i < 3;i++){
            for(int j = 0;j < 3;j++){
                matrxMult[i][j]=0;
                for(int k = 0;k<3;k++){
                    matrxMult[i][j] += matrxA[i][k]*matrxB[k][j];
                }
            }
        }
        return matrxMult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write element for first 3 X 3 matrix.");
        int[][] matrx1 = write(sc);
        System.out.println("Write element for second 3 X 3 matrix.");
        int[][] matrx2 = write(sc);
        sc.close();
        System.out.println("Your entered matrix A : ");
        read(matrx1);
        System.out.println("Your entered matrix B : ");
        read(matrx2);
        System.out.println("The Sum of matrix A  and matrix B : ");
        int[][] sumMatrx =Sum(matrx1, matrx2);
        read(sumMatrx);
        System.out.println("The matrix multiplication of matrix A and matrix B : ");
        int[][] multMatrx = mult(matrx1,matrx2);
        read(multMatrx);
    }
}