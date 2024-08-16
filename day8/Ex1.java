class Ex1
{
	public static void main(String[] args) {
		int[] x=new int[]{10,20,30};//new 之後陣列長度無法再增加
		System.out.println(x);
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		//System.out.println(x[3]);


		x=new int[10];
		System.out.println(x);
		for(int i=0;i<x.length;i++)
		{
		System.out.println(x[i]);
		}
		for(int o:x)
		{
			System.out.println(o);
		}
		
	}
}