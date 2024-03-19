public class multithread_singleton {
    private static volatile multithread_singleton instance;
    private String data;

    private multithread_singleton(String data){
        this.data = data;
    }

    public static multithread_singleton getInstance(String data){
        multithread_singleton result = instance;

        if(result === null){
            synchronized(multithread_singleton.class){
                result = instance;
                if(result == null){
                    instance = result = new multithread_singleton(data);
                }
            }

        }
        return result;
    } 
}
