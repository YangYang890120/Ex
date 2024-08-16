class Array_3
{
	public static void main(String[] args) {
		int[] x=new int[]{10,20,30};
		int[] y=new int[]{40,50,60};

		System.out.println("x="+x);
		System.out.println("y="+y);

		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);

		System.out.println("===================");
		x=y;//位址=位址-->傳址-->同一個-->被消滅--->garbage collection
		//x[0]=y[0];//值=值-->傳值-->複製
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);

		System.out.println("===================");
		y[0]=500;

		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);

		x=null;//garbage collection

		

		/*
		int x=10;
		int y=20;

		System.out.println("x="+x);
		System.out.println("y="+y);

		System.out.println("===================");
		x=y;

		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("===================");
		y=300;

		System.out.println("x="+x);
		System.out.println("y="+y);
		*/


	}
}