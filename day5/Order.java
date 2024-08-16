class Order
{
private String name;
/*
int ruler;
int pen;
int sum;
*/
private Integer ruler;
private Integer pen;
private Integer sum;

Order(){}

Order(String name,int ruler, int pen)
{
	if(ruler>=0 && pen>=0)
	{
		this.name = name;
		this.ruler = ruler;
		this.pen = pen;
		this.sum= this.ruler*29 + this.pen*30;
	}
	
}
/*
Order(int ruler,int pen)
{
	this.ruler = ruler;
	this.pen = pen;
	this.sum= this.ruler*29 + this.pen*30;
}
Order(String name,int ruler){};
Order(int ruler,String name){};*/
//Order(String x , int ruler){};前面已經有相同定義了

String getName()
{
	return this.name;
}

void setName(String name)
{
	this.name=name;
}














void change1(int ruler,int pen)
{
	this.ruler=ruler;
	this.pen=pen;
	this.sum= this.ruler*29 + this.pen*30;
}
int change2(int ruler,int pen)
{
	if(ruler>=0 && pen>=0)
	{
		this.ruler=ruler;
		this.pen=pen;
		this.sum= this.ruler*29 + this.pen*30;
		return this.sum;//Integer to int - ->Autounboxing
	}
	else
	{
		return 0;
	}
}

void show()
{
	System.out.println("名:"+name+"\t尺:"+ruler+"\t筆:"+pen+"\t總價:"+sum);
}







}
