class Ex2
{
	public static void main(String[] args) {

		Cal.setX1(10);

		Cal c1=new Cal();//Cal.x1+1=0+1=1   c1.x2=c1.x2+1=0+1=1
		Cal c2=new Cal();//Cal.x1+1=1+1=2   c2.x2=c2.x2+1=0+1=1
		c1.show();//Cal.x1=2,c1.x2=1
		c2.show();//Cal.x1=2,c2.x2=1
	}
}