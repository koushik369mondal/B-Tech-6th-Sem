package Leetcode.Easy;

public class Leet_1572 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        Leet_1572 obj = new Leet_1572();
        System.out.println(obj.diagonalSum(mat));
    }

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j) {
                    sum += mat[i][j];
                } else if (i + j == n - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
