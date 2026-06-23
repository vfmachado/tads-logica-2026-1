public class Sudoku {

    public static void main(String[] args) {
        
        int [][] BOARD = {
            {0, 1, 0,  0, 0, 0,  0, 0, 0},
            {0, 0, 1,  0, 0, 0,  0, 0, 0},
            {1, 0, 0,  0, 0, 0,  0, 0, 0},

            {0, 0, 0,  1, 0, 0,  0, 0, 0},
            {0, 0, 0,  0, 0, 1,  0, 0, 0},
            {0, 0, 0,  0, 1, 0,  0, 0, 0},

            {0, 0, 0,  0, 0, 0,  0, 0, 1},
            {0, 0, 0,  0, 0, 0,  1, 0, 0},
            {0, 0, 0,  0, 0, 0,  0, 0, 1}
        };

        // SUDOKU REGRAS
        // 1. Cada linha deve conter os números de 1 a 9, sem repetições.
        // 2. Cada coluna deve conter os números de 1 a 9, sem repetições.
        // 3. Cada uma das nove subgrades 3x3 deve conter os números de 1 a 9, sem repetições.

        boolean repete = false;
        // 1. Cada linha deve conter os números de 1 a 9, sem repetições.
        for (int linha = 0; linha < 9; linha++) {
            for (int i = 0; i < BOARD[linha].length; i++) {
                for (int j = i+1; j < BOARD[linha].length; j++ ) {
                    if (BOARD[linha][i] != 0 && BOARD[linha][i] == BOARD[linha][j]) // existe algum elemento repetido nesta linha 
                        repete = true;
                }
            }
        }
        
        if (repete) {
            System.out.println("BOARD INVALIDO!");
        } else {
            System.out.println("BOARD VALIDO");
        }
        





    }

}