package models;

import helpers.Constants;
import helpers.Direction;

public class Snake {
    
    private int size;
    private Node head;
    private Node tail;
    private Direction dir;

    public Snake(int posX, int posY, Direction dir){
        this.dir = dir;
        this.create(new Node(posX,posY));
    }

    public int getSize(){
        return this.size;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public Direction getDir() {
        return dir;
    }
    
    public void setDir(Direction dir) {
        this.dir = dir;
    }

    public boolean isEmpty(){
        return this.head==null;
    }

    private void create(Node node){
        this.head = node;
        this.tail = node;
        this.size = 1;
    }

    public void add(Node node){
        int posX = node.getPosX();
        int posY = node.getPosY();
        switch(this.dir){
            case WEST:
                posX = node.getPosX() - Constants.SIZE_BLOCK;
                break;
            case NORTH:
                posY = node.getPosY() + Constants.SIZE_BLOCK;
                break;
            case EAST:
                posX = node.getPosX() + Constants.SIZE_BLOCK;
                break;
            case SOUTH:
                posY = node.getPosY() - Constants.SIZE_BLOCK;
                break;
        }
        Node aux = new Node(posX,posY);
        node.setPrev(aux);
        aux.setNext(node);
        this.head = aux;
        this.size++;
    }

    public void deleteLast(){
        this.tail = this.tail.getPrev();
        this.tail.setNext(null);
        this.size--;
    }

}
