class Student
{
	//field-->資料庫 colunm
	String sname;
	int chi;//global
	double eng;
	boolean math;

	//constructors
	Student(int chi)//local-->參數引數 arguments-->int chi=?
	{
		//this.chi=chi;//加this就變上面的global
		chi=60;//global全區域變數
		//int chi=60//local地區變數
		//System.out.println("新增一名學生");
	}

	//methods
	void show()
	{
		System.out.println("名:"+sname+"\t國文:"+chi+"\t英文:"+eng);//global
	}
}