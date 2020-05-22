package com.company;

public class Main {

    public static void main(String[] args) {
   /*Shape shape = new Triangle();
      myDrawMethod(shape);
      Shape shape1 =new Square();
      myDrawMethod(shape1);*/
    Drawing drawing = new Drawing();

        drawing.setShape(new Triangle());
        drawing.setShape(new Square());
        drawing.drawShape();
    }

    public static void myDrawMethod(Shape shape){
        shape.draw();
    }
}
