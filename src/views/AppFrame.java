package views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import helpers.Constants;

public class AppFrame extends JFrame{

    public AppFrame(){
        this.launch();
        this.setScene(new GamePanel(this));
    }

    public void launch(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Constants.HEIGHT,Constants.HEIGHT);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
    }

    public void setScene(JPanel panel){
        this.getContentPane().removeAll();
        this.getContentPane().add(panel);
    }
    
}
