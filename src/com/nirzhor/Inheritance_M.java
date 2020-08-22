package com.nirzhor;

public class Inheritance_M {


    public static void main(String[] args) {

        /*
            //var control = new UIControl();
            var control = new TextBox();
            control.disable();
            System.out.println(control.isEnabled());
        */

        /*
            var box1 = new TextBox();
            /// var box2 = box1;
            var box2 = new TextBox();
            ///System.out.println(box1.hashCode());
            /// System.out.println(box1.equals(box2));
            /// System.out.println(box2.hashCode());
            System.out.println(box1.toString());
        */

        /*
            var textBox = new TextBox();
            textBox.setText("Hello World");
            System.out.println(textBox.toString());
            // println automatically call toString method on any object
            System.out.println(textBox);
        */

      //  var control = new UIControl(true);
        var textBox = new TextBox();
        /// show(control);
        ///show(textBox);
    }

    public static void show(UIControl control) {
        if(control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello World ");
        }
        System.out.println(control);
    }
}
