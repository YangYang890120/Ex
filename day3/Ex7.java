class Ex7
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("請輸入長");
		int x = sc.nextInt();
		System.out.println("請輸入寬");
		int y = sc.nextInt();
		int x1=0;
		while(x1<x)
		{
			int y1=0;
			while(y1<y)
			{
				System.out.print("@");
				y1++;
			}
			System.out.println();
			x1++;
		}
		
	}
}