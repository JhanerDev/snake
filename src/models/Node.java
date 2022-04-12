package models;

public class Node{
    
    private int posX;
    private int posY;

    private Node prev;
    private Node next;

    public Node(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }  

    public void setNext(Node next) {
        this.next = next;
    }
    
    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }


}
