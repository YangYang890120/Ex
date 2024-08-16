class Ex3
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("請輸入整數");
		// int x = sc.nextInt();
		// System.out.println(x>=60?"及格":"不及格");

		int x = sc.nextInt();
		if(x%2==0)
		{
			if(x>=0)
			{
				System.out.println("正偶數");
			}
			else
			{
				System.out.println("負偶數");
			}

		}
		else 
		{
			if(x>=0)
			{
				System.out.println("正奇數");
			}
			else
			{
				System.out.println("負奇數");
			}
		}

	}
}