public class factoryPatterndemo {
    public static void main(String[] args){
        shapefactory factory = new shapefactory();

        shape circle = factory.getShape("circle");
        circle.draw();
        shape rectangle = factory.getShape("rectangle");
        rectangle.draw();
        shape square = factory.getShape("square");
        square.draw();
    }
}
