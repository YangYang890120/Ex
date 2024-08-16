class Ex8
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("請輸入次數");
		int x = sc.nextInt();
		for(int y = 1;y<=x;y++)
		{
			// if(y==121) break;
			if(y==121) continue;
			System.out.println("y="+y+"\thello java");
		}
		
	}
}