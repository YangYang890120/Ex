class StudentScore
{
	String name;
	int chi;
	int eng;
	int sum;


	StudentScore(String name,int chi,int eng)
	{
		this.name=name;
		this.chi=chi;
		this.eng=eng;
		this.sum=this.chi+this.eng;
	}	

void show()
{
	System.out.println("名:"+name+
						"\n國文:"+chi+
						"\n英文:"+eng+
						"\n總分:"+sum);
}



}