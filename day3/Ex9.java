class Ex9
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("請輸入列數");
		int x = sc.nextInt();
		System.out.println("請輸入行數");
		int y = sc.nextInt();
		a:
		for(int n=1;n<=x;n++)
		{
			
			for(int m=1;m<=y;m++)
			{
				if(m==8) break;
				if(n==8) break a;
				System.out.print(n+"*"+m+"="+(n*m)+"\t");
			}
			System.out.println();
		}

	}
}