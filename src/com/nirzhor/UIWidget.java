package com.nirzhor;

public interface UIWidget
        extends Draggable, Resizable {
 // Class can't have multiple parents but interface can have.
    void render();

}

