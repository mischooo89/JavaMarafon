package Day17.Task2;

import Day17.ChessPiece;

public class ChessBoard {
    ChessPiece[][] chessboard;

    public ChessBoard(ChessPiece [][] chessboard){
        this.chessboard = chessboard;
    }

    public ChessPiece[][] getChessboard() {
        return chessboard;
    }

    public void print(){
        for(int i = 0; i<=chessboard.length; i++){
            for(int j = 0; j< chessboard.length; j++){
                System.out.print(chessboard[i][j].getFigure());
            }
            System.out.println();
        }

    }




}
