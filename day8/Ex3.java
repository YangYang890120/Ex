class Ex3
{
	public static void main(String[] args) {
		int[][][] x=new int[2][2][3];
		/*System.out.println(x);
		System.out.println(x.length);
		System.out.println(x[0]);
		System.out.println(x[0].length);
		System.out.println(x[0][0]);
		System.out.println(x[0][0].length);
		System.out.println(x[0][0][0]);*/
		System.out.println("=======================");
		System.out.println(x);
		for(int i=0;i<x.length;i++)
		{
			System.out.println("\t"+x[i]);
			for(int j=0;j<x[0].length;j++)
			{
				System.out.println("\t\t"+x[i][j]);
				for(int k=0;k<x[0][0].length;k++)
				{
					System.out.println("\t\t\t"+x[i][j][k]);
		
				}
			}
		
		}
		System.out.println("=======================");
		System.out.println(x);
		for(int[][] o:x)
		{
			System.out.println("\t"+o);
			for(int[] u:o)
			{
				System.out.println("\t\t"+u);
				for(int k:u)
				{
					System.out.println("\t\t\t"+k);
				}
			}
		}


	}
}