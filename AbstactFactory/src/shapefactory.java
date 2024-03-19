public class shapefactory extends abstractfactory{
    @Override 
    public shape getShape(String shapetype){
        if(shapetype.equalsIgnoreCase("rectangle")){
            return new rectangle();
        }
        if(shapetype.equalsIgnoreCase("sqaure")){
            return new squre();
        }
        return null;
    }
    
}
