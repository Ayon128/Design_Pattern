public abstract class shape {
    drawApi dApi;

    public shape(drawApi dApi){
        this.dApi = dApi;
    }

    public abstract void draw();
     
}
