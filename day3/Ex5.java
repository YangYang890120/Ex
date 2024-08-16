class Ex5
{
	public static void main(String[] args) {
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		// System.out.println("請輸入數字");
		// int x = sc.nextInt();

		// while(x!=1234)
		// {
		// 	System.out.println("答錯請重新輸入");
		// 	x=sc.nextInt();
		// }
		// System.out.println("恭喜你答對");

		// for(int i =1; i<=5;)
		// {
		// 	System.out.println("i="+i+"hello world");
		// 	i++;
		// }

		int i =100;
		do
		{
			if(i<=5)
			{
				System.out.println("i="+i+"hello world");
				i++;
			}
			else
			{
				System.out.println("error i ="+ i);
			}
		}while(i<=5);

		// for(int x=1;x<=9;x++)
		// {System.out.println();
		// 	for(int y =1;y<=9;y++){
		// 		System.out.print(x*y+"_");
		// 	}
		// }
	}
}