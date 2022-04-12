package controller;

import javax.swing.JFrame;

import helpers.Constants;
import helpers.Direction;
import models.Snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameController implements KeyListener{

    JFrame frame;
    Snake snake;

    public GameController(JFrame frame) {
        this.frame = frame;
        this.initComponents();        
    }

    public void initComponents(){
        this.snake = new Snake(Constants.WIDTH/2,Constants.HEIGHT/2,Direction.NORTH);
        this.frame.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            if(this.validMove(snake.getDir(),Direction.WEST)){
                snake.setDir(Direction.WEST);
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_UP){
            if(this.validMove(snake.getDir(),Direction.NORTH)){
                snake.setDir(Direction.NORTH);
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            if(this.validMove(snake.getDir(),Direction.EAST)){
                snake.setDir(Direction.EAST);
            }
        } 
        if (e.getKeyCode() == KeyEvent.VK_DOWN){
            if(this.validMove(snake.getDir(),Direction.SOUTH)){
                snake.setDir(Direction.SOUTH);
            }
        }    
    }

    public boolean validMove(Direction dir_snake, Direction dir_pressed){
        switch(dir_pressed){
            case WEST,EAST:
                if(dir_snake == Direction.NORTH || dir_snake == Direction.SOUTH )
                    return true;
                break;
            case NORTH,SOUTH:
                if(dir_snake == Direction.WEST || dir_snake  == Direction.EAST )
                    return true;
                break;
        }
        return false;
    }

}
