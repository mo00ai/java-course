package chapter1.array;

public class BlackStoneFinder{
    public static void main(String[] args) {

        boolean[][] board = {
                {true, false},
                {false, true}
        };

        for(int i = 0; i<board.length; i++) {
            for(int j = 0; j<board[i].length; j++) {
                if(board[i][j]) {
                    System.out.println("검은 돌 위치: (" +i+","+j + ")");
                }


            }
        }


    }
}
