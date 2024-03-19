public class shapefactory {

    public shape getShape(String shapetype){
        if (shapetype == null){
            return null;
        }
        if (shapetype.equalsIgnoreCase("circle")){
            return new circle();
        }
        if (shapetype.equalsIgnoreCase("rectangle")){
            return new rectangle();
        }
        if (shapetype.equalsIgnoreCase("square")){
            return new sqaure();
        }
        return null;
    }
    
}
