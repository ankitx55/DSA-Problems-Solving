//public class validSudoku {
//    public static void main(String[] args) {
////        https://leetcode.com/problems/valid-sudoku/description/
////        Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
////
////        Each row must contain the digits 1-9 without repetition.
////        Each column must contain the digits 1-9 without repetition.
////        Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
////        char[][] board = {
////                {"5","3",".",".","7",".",".",".","."},
////                {"6",".",".","1","9","5",".",".","."},
////                {".","9","8",".",".",".",".","6","."},
////                {"8",".",".",".","6",".",".",".","3"},
////                {"4",".",".","8",".","3",".",".","1"},
////                {"7",".",".",".","2",".",".",".","6"},
////                {".","6",".",".",".",".","2","8","."},
////                {".",".",".","4","1","9",".",".","5"},
////                {".",".",".",".","8",".",".","7","9"}
////        };
//
//        boolean ans = isValidSudoku(board);
//        System.out.println(ans);
//
//
//    }
//
//    static boolean isValidSudoku(char[][] board){
//        // Case 1: Row
//        // board[1++][1-9]
//        boolean[] count = new boolean[13];
//        for(int i=0;i<9;i++){
//            for(int j=0;j<9;j++){
//                if(count[board[i][j]-46]){
//                    return false;
//                }else if(board[i][j]!='.'){
//                    count[board[i][j]-46]=true;
//                }
//            }
//            count = new boolean[13];
//        }
//
//        // Case 2: Column
//        // board[1-9][1++]
//        for(int i=0;i<9;i++){
//            for(int j=0;j<9;j++){
//                if(count[board[j][i]-46]){
//                    return false;
//                }else if(board[j][i]!='.'){
//                    count[board[j][i]-46]=true;
//                }
//            }
//            count = new boolean[13];
//        }
//
//        // Case 3: Square
//        // board[][]
//        int m=0,n=0;
//        while(true){
//            for(int i=0;i<3;i++){
//                for(int j=0;j<3;j++){
//                    if(count[board[m+i][n+j]-46]){
//                        return false;
//                    }else if(board[m+i][n+j]!='.'){
//                        count[board[m+i][n+j]-46]=true;
//                    }
//                }
//            }
//            if(n==6 && m==6) break;
//
//            if(m==6){
//                n+=3;
//                m=0;
//            }else{
//                m+=3;
//            }
//            count = new boolean[13];
//        }
//        return true;
//    }
//
//
//}
