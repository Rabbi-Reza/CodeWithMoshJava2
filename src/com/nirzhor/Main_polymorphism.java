package com.nirzhor;

public class Main_polymorphism {

    public static void main(String[] args) {

        UIControl[] controls = { new TextBox(),  new CheckBox()};

        for (var control : controls){
            // if control is TextBox
            //    renderTextBox
            // else if it is a checkbox
            //    renderCheckBox
            control.render(); // Polymorphism

        }
    }
}
