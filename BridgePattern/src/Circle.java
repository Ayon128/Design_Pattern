public class Circle extends shape {

    private int x, y, r;

    public Circle(int x, int y,int r, drawApi dapi){
        super(dapi);
        this.x = x;
        this.y = y;
        this.r = r;
    }
    
    @Override
    public void draw(){
        dApi.drawCircle(r,x,y);
    }
}
