class Cal
{
	private static int x1;
	private	int x2;



	static void setX1()
	{
		Cal.x1=x1;
	} 



	static 
	{
		x1=10+x1*20;//設定初始值算完會回傳到上面的x1
	}
	Cal()
	{
		x1++;
		x2++;//static的值會累加
	}

	void show()
	{
		System.out.println("x1="+x1+"\tx2="+x2);
	}


}