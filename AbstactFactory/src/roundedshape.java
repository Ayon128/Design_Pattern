public class roundedshape extends abstractfactory{
    @Override 
    public shape getShape(String shapetype){
        if(shapetype.equalsIgnoreCase("roundedrectangle")){
            return new roundedrectangle();
        }
        if(shapetype.equalsIgnoreCase("roundedsquare")){
            return new roundedsquare();
        }
        return null;
    }
    
}
