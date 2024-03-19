public class facade {
    private circle circle;
    private recatangle recatangle;
    private square square;
    
    public facade(){
        circle = new circle();
        recatangle = new recatangle();
        square = new square();
    }
 public void drawCircle(){
    circle.draw();
 }
 public void drawRectangle(){
    recatangle.draw();
 }

public void drawSquare(){
    square.draw();
 }
}
