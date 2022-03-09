package classesPillarsObjects;

public class TestEncapsulation {
	public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
        obj.setName("Shakeer"); 
        obj.setAge(22); 
        obj.setRoll(101); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll: " + obj.getRoll());      
    } 


}