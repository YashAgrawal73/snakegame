
package snakegame;
import javax.swing.*;
    
public class SnakeGame extends JFrame {

     SnakeGame(){
        super("SnakeGame");  // super must be the first statenebnt inside the constructorf
        add(new Board());                    // Board class called
        pack();                                // refrsh the frame
       
                              
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true); 

    }

public static void main(String[] args) {
    new SnakeGame();
}
}
