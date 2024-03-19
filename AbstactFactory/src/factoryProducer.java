public class factoryProducer {

public abstractfactory getFactory(boolean rounded){
    if(rounded){
        return new roundedshape();
    }
    else{
        return new shapefactory();
    }
}
    
}
