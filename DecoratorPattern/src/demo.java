public class demo {
    public static void main(String[] args){
        shape circle = new cirle();

        shape  redcircle = new redShapeDecorator(circle);
        redcircle.draw();
        shape rectangle = new rectangle();

        shape  redrectangle = new redShapeDecorator(rectangle);
        redrectangle.draw();
    }

}
