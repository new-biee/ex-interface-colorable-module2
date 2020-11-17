package com.main;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle("green", true, 3);
        shapes[1] = new Rectangle("yellow", true, 3, 5);
        shapes[2] = new Square("gray", true, 10);

        Square square = (Square) shapes[2]; //casting down
        square.howToColor();

    }
}
