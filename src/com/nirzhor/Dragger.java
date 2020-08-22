package com.nirzhor;

public class Dragger {
    public void drag(Draggable draggable) {

        // Interface Segregation Principle
        draggable.drag();
        System.out.println("Dragging done!");
    }
}
