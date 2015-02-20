public class Main {

    public static void main(String[] args) {

        int[][] matrix_a = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        int[][] matrix_b = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};

        System.out.println("The multiplication of matrix_a and matrix_b is equal to");

        if (matrix_a.length>0 && matrix_b.length>0) {

            int[][] matrix_c = new int[matrix_a.length][matrix_b[0].length];

            if(matrix_a.length == matrix_b[0].length) {
                for (int i=0; i<matrix_a.length; i++) {
                    for (int j=0; j<matrix_b[0].length; j++) {
                        matrix_c[i][j] += matrix_a[i][j]*matrix_b[j][i];
                        System.out.println("i " + i + "j "+ j + " " + matrix_c[i][j]);
                    }
                    break;
                }
            }

            for (int i=0;i<matrix_c.length;i++) {
                for (int j=0;j<matrix_c[0].length;j++) {
                    System.out.print(matrix_b[i][j]);
                }
                System.out.println('\n');
            }
        }
    }

}

