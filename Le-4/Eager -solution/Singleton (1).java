public class Singleton{
    private static Singelton uniqueInstance =new Singelton();
    private Singelton(){}
     public static Singelton getInstance(){
         return uniqueInstance;
     }
}