package views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.GameController;


public class GamePanel extends JPanel{

    public GamePanel(JFrame frame){
        new GameController(frame);
    }
    
}
