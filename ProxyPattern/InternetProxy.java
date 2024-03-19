public class InternetProxy implements Connection{
    internet i = new internet();

    @Override 
    public void CreateConnection(String sender, String receiver){
     if(receiver.equals("192.168.1.1")){
        System.out.println("Receiver is unauthorized");
       
     }
     else
     {
        i.CreateConnection("192.168.0.1","192.168.1.10");
     }
    }
    
}
