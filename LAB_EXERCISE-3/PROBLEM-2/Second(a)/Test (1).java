public class Test implements Testable{
    @Override
    public void display(){
        System.out.println("display method from test class");
        
    }
    
    public void someOtherMethod(){
        System.out.println("some other method implements in testable class");
    }
}