

	public class Main {
		public static void main(String[]args)
		{
			Shape[]arr=new Shape[3];
			arr[0]=new Triangle();
			arr[1]=new Polygon();
			arr[2]=new Circle();
			arr[0].draw();
			arr[1].draw();
			arr[2].draw();

		}
		}

