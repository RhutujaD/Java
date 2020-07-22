

class D {
	static {
		System.out.println("inside class 'A' static intializer");
	}
	
}
class E {
	static {
		System.out.println("inside class 'B' static intializer");
	}
}
class F {
	static {
		System.out.println("inside class 'C' static intializer");
	}
}
public class demo1 {
 
	static {
		System.out.println("inside class 'demo1' static intializer");
	}
	public static void main(String[] args) {
	 F c= new F();	
     D a= new D();
     E b= new E();
	}

}