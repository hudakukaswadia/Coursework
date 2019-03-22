import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.*;

public class Board extends JPanel

{
   int row;                             
   int col;
   Square [][] check = new Square [8][8];                                      //8 Rows and 8 Columns
   GridLayout layout = new GridLayout(8, 8);                                   //Creating the grid with 8 rows and 8 columns
   JPanel mainPanel = new JPanel();                                            //Create a panel
    
   public static void main(String[] args)
   {
       Board board = new Board ();
   }

   public Board()
   {
       JFrame frame = new JFrame();                                            //Create a blank window
       frame.add(mainPanel);
       mainPanel.setLayout(layout);                                            //Assign to Panel
  
       for (row = 0; row < 8; row++)                                           //Set up the board with checkers in position for the beginning of a game.
       {
           for (col = 0; col < 8; col++)
           {
               if ((row%2 == 0 && col%2 == 0) || (row%2 == 1 && col%2 == 1) )  //This assigns the pattern to the Checkboard
               {    
                   Square s = new Square (row , col , "black");                //Place black squares on the board
                   s.checker();
                   check[row][col] = s;
                   mainPanel.add(s.getPanel());
               }
               else
               {
                   Square d;
                   if (row < 3)                                                //Sets a condition, if row is less than 3 then add red piece in the set pattern assigned
                   {
                       d = new Square (row, col, "redPiece");
                   }
                   else if (row > 4)
                   {
                       d = new Square (row, col, "whitePiece");                //If the above condition isn't satisfied, another condition is set i.e. add white piece from rows 5 till 8
                   }
                   else
                   {
                       d = new Square (row , col , "white");                   //If both the conditions aren't met, then add white square
                   }
                   d.checker();
                   check [row][col] = d;
                   mainPanel.add(d.getPanel());
               }
           }
       }

       frame.setSize(600, 600);                                                //Size of the window
       frame.setTitle ("Draughts");                                            //Title set as Draughts
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);                                                 //Make it visible
     
  }
}
