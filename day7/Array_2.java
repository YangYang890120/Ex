class Array_2
{
	public static void main(String[] args) {

		//動態初始值
		/*int[] x=new int[3];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		for(int i=0;i<3;i++)
		{
			System.out.println(x[i]);
		}*/

		//================================/
		//靜態初始值
		int[] x=new int[]{10,20,0,50,60,80,90,70};
		System.out.println(x);
		System.out.println(x.length);

		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
			System.out.println("==============");
		for(int o:x)
		{
			System.out.println(o);
		}
		


	}
}