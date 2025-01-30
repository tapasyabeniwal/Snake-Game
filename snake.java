package snakegame2;
import javax.swing.*;

public class SnakeGame2 extends JFrame {
    
    SnakeGame2() {
        super("Snake Game ");
        add(new Board());
        pack();
        
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new SnakeGame2().setVisible(true);
    }
}
