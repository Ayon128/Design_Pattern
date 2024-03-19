public class Singleton_Eager {
    private static Singleton_Eager instance = new Singleton_Eager();

    public static Singleton_Eager getinstance()
    {
        return instance;
    } 
    
}
