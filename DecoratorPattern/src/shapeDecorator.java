public abstract class shapeDecorator implements shape{
    shape decoratrShape;

    public shapeDecorator(shape decoratorShape){
     this.decoratrShape = decoratorShape;
    }

    @override
    public void draw(){
        decoratrShape.draw();
    }
}
