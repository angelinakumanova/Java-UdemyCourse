package ClassesObjectsAndMethods;


public class TicTacToe {
    public static void main(String[] args) {
        char[][] ticTacToe = {
                {'O','X','X'},
                {'X','O','O'},
                {'X','O','O'}
        };

        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe.length; j++) {
                System.out.print(ticTacToe[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        // Accessing the bottom right square
        System.out.println(ticTacToe[2][2]);
    }
}
