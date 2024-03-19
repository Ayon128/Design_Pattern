public class Singleton_Lazy {

    private static Singleton_Lazy instance = null;

   public static Singleton_Lazy getInstance() 
    {
        if(instance== null){
            return new Singleton_Lazy();
        }
        return instance;
    }

    public void check(){
        System.out.println("checking the pattern.....");
    }
    
}
