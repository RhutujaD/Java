

class A {
private int w = 150;
	
	public int getw()
	{
		return this.w;
	}	
	public void setw(int w)
	{
		this.w = w;
	}
}
class B {
static private int w = 150;
	
	public static int getw()
	{
		return w;
	}	
}
class C {
	static {
		System.out.println("this is inside static initializer block");
	}
}
public class demo {

	
	public static void main(String[] args) {
	
		A a = new A();
		System.out.println(a.getw());
		a.setw(100);
		System.out.println(a.getw());
		System.out.println(B.getw());
		C c = new C();
	}

}