
public class A {
	int x =10;
	int y =15;
	
	public static void main(String[] args) {
		A a =new A();
		System.out.println(a.x);//output will be 10
		System.out.println(a.y);//output will be 15
		//Let's change the value 
		a.x=12;
		a.y=17;
		System.out.println(a.x);  //output will be 12
		System.out.println(a.y);//output will be 17
		
		
	}

}
