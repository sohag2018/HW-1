
public class B {
	
	String st1="Muhammad";
	String st2="Muhammad";

	//public static void main(String[] args) {
		public static void main(String...args) {	
		B b =new B();
		System.out.println(b.st1);//output will be "Muhammad"
		System.out.println(b.st2);//output will be "Muhammad" because st2 will refer the same object
		
		//Let's change the st2 
		
		b.st2.concat("Kabir");  
		System.out.println(b.st2);//We expect output should be MuhammadKabir but it will be Muhammad again because still st2 will refer the same object
		
		// what will happen about the new object "MuhammdKabir"--> as it is created as new object but not referred>> it will be cleaned by garbage collector (if we dont put in a new reference variable)
	
	
	 String st3=b.st2.concat("Kabir"); 
	 System.out.println(st3);  //output will be MuhammadKabir as new object will be refereed by st3
	 
	}

}
