class Ex1
{
	public static void main(String[] args) {
		java.util.Scanner  sc=new java.util.Scanner(System.in);
		// 	System.out.println("請輸入分數");
		// 	int x = sc.nextInt();
		// if(x>80)
		// 	System.out.println("超恭喜");
		// 	if(x>=60) 
		// 	{
		// 		System.out.println("及格");
		// 		System.out.println("恭喜你");
		// 	}
		// 	else
		// 	{
		// 		System.out.println("不及格");
		// 		System.out.println("再加油");
		// }
			// System.out.println("請輸入分數");
			// int z = sc.nextInt();
			// if(z>=90 && z<=100)
			// {
			// 	System.out.println("A");
			// }
			// else if (z>=80 && z<=89)
			// {
			// 	if(z>=85)
			// 	{
			// 		System.out.println("B+");
			// 	}
			// 	else
			// 	{
			// 		System.out.println("B-");
			// 	}
			// }
			// else if (z>=70 && z<=79)
			// {
			// 	System.out.println("C");
			// }
			// else if (z>=60 && z<=69)
			// {
			// 	System.out.println("D");
			// }
			// else if (z>=0 && z<=59)
			// {
			// 	System.out.println("E");
			// }
			// else 
			// {
			// 	System.out.println("重填，輸入0~100");
			// }

			System.out.println("請輸入整數來判斷是否為3或2的倍數");
			int y = sc.nextInt();
			// int x = y%2;
			// int z = y%3;

			if(y%2==0)
			{
				System.out.println("是2的倍數");
				 	if(y%3==0) 
				{
					System.out.println("也是3的倍數");
				}
			}
			else if(y%3==0) 
			{
				System.out.println("是3的倍數");
			}
			else
				System.out.println("都不是");
	}
}