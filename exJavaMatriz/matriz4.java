public class matriz4 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] transposta = new int[3][3];


        System.out.println("Matriz original:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                transposta[j][i] = mat[i][j];
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();

        System.out.println("Matriz transposta:");
            for (int i = 0; i < transposta.length; i++) {
                for (int j = 0; j < transposta[i].length; j++) {
                    System.out.print(transposta[i][j] + " ");
                }
                System.out.println();
            }
        }
    }