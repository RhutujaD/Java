

public class demoob {

	private int number = 100;
	public void setnum(int no)
	{
		this.number = no;
	}
	public int getnum()
	{
		return this.number;
	}
	public static void main(String[] args) {

		demoob d1 = new demoob();
		System.out.println(d1.getnum());
		demoob d2 = d1;
		d1.setnum(200);
		System.out.println(d2.getnum());
	}

}