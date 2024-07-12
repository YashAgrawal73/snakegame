
package snakegame;
import javax.swing.*;
    
public class SnakeGame extends JFrame {

     SnakeGame(){
        super("SnakeGame"); 
        add(new Board());                   
        pack();                           
       
                              
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true); 

    }

public static void main(String[] args) {
    new SnakeGame();
}
}
