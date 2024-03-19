public class demo {

    public static void main(String[] args){
    
      abstractfactory shapefactory = new factoryProducer().getFactory(false);
      shape  shape1 = shapefactory.getShape("rectangle");
      shape1.draw();
      shape  shape2 = shapefactory.getShape("sqaure");
      shape2.draw();

      abstractfactory shapefactory1 = new factoryProducer().getFactory(true);
      shape  shape3 = shapefactory1.getShape("roundedrectangle");
      shape3.draw();
      shape  shape4 = shapefactory1.getShape("roundedsquare");
      shape4.draw();

    }
    
}
