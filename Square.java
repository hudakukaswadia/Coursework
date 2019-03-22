import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Square
{
   int a;                                                                      //Declare int b
   int b;                                                                      //Declare int a
   String updatedPiece;                                                        //Instance variable
   public ImageIcon whitePiece = new ImageIcon ("white.png");                  //The image white.png will now be referred to as whitePiece
   public ImageIcon redPiece = new ImageIcon ("red.png");                      //The image red.png will now be referred to as redPiece
   public ImageIcon highlight = new ImageIcon ("selected.png");                //The image selected.png will now be referred to as highlight
   public ImageIcon white_king = new ImageIcon ("white-king.png");             //The image white-king.png will now be referred to as white_king
   public ImageIcon red_king = new ImageIcon ("red-king.png");                 //The image red-king.png will now be referred to as red_king
   public ImageIcon white = new ImageIcon ("empty.png");                       //The image empty.png will now be referred to as white
   public ImageIcon black = new ImageIcon ("empty2.png");                      //The image empty2.png will now be referred to as black
   private JPanel panel;                                                       //Panel variable is visible in Square class only
   private JButton button = new JButton();                                     //Creates a clickable Jbutton referred as button


   public void checker()
   {
       if (updatedPiece == "whitePiece")
       button.setIcon(whitePiece);
       else
       if (updatedPiece == "redPiece")
       button.setIcon (redPiece);
       else
       if (updatedPiece == "white")
       button.setIcon (white);
       else
       if (updatedPiece == "black")
       button.setIcon (black);
   }

   public Square(int row, int col, String piece)
   {
       a = row;                                                               
       b = col;
       updatedPiece = piece;
       panel = new JPanel(new GridLayout());                                   //Creates a panel and the grid layout is assigned in the constructor
       panel.add(button);                                                      //Adds the JButton
   }

   public JPanel getPanel()                                                    //This is an accessor
   {
       return panel;                                                           //This will return panel
   }
}


