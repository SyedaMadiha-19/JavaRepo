// package Practice;

//An abstract class may or may not have have abstract methods but abstract methods an b defined only in an abstract class.
//OBJECTS for abstract class CANNOT BE CREATED.But its references can be created.
//abstract method includes only declaration of method not implementation.
//class inheriting "abstract class" SHOULD DEFINE THE DECLARED METHOD.


abstract class Shape{

    abstract void draw();

}


class Square extends Shape{

    void draw(){
        System.out.println("Drawing Square");
    }
}

// package Practice;

class Circle extends Shape {
    void draw(){
        System.out.println("Drawing Circle");
    }
    
}
public class DynamicDispatch {
    public static void main(String[] args) {
        Shape s;
        s = new Square();
        s.draw();
        s = new Circle();
        s.draw();

    }
}
