class Fv
{
	private static int pv;
	private Double r;
	private Integer n;
	private Integer fv;

	Fv(double r, int n)
	{
		this.r=r;
		this.n=n;
		this.fv=(int)(this.pv*(1+this.r*this.n));
	}
	static int cal(int x,int y)
	{
		return x*y;
	}
	/*static*/ void setR(double r)
	{
		this.r=r;
	}

	static void setPv(int pv)
	{
		Fv.pv=pv;
	}

	static String CompanyName()
	{
		return "巨匠電腦";
	}
	static String Title()
	{
		return "本金\t年利率\t期數\t單利本利和";
	}

	void show()
	{
		this.fv=(int)(this.pv*(1+this.r*this.n));

		System.out.println(pv+"\t"+r+"\t"+n+"\t"+fv);









	}

}