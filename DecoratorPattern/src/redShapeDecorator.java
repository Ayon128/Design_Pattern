public class redShapeDecorator extends shapeDecorator {
   public redShapeDecorator(shape decoratedShape){
    super(decoratedShape);
   } 

   @override
   public void draw(){
    decoratrShape.draw();
    setRedBorder(decoratrShape);

   }
   private void setRedBorder(shape decorShape){
    System.out.println("Border color : red");
   }
}
