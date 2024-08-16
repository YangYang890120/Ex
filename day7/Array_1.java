class Array_1
{
	public static void main(String[] args) {
		
		//int[] x=new int[3];
		//double [] x=new double[3];
		boolean[] x=new boolean[3];
		//Boolean[] x=new Boolean[3];
		System.out.println(x);
		for(int i=0;i<3;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("===============");
		System.out.println(x);
		//for(int o:x)
		//for(double o:x)
		//for(boolean o:x)//boolean o=null;因為boolean沒辦法接受null
		for(Boolean o:x)
		{
			System.out.println(o);
		}
		/*
		System.out.println(x);
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);*/
	}
}