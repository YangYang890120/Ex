class Ex2
{
	public static void main(String[] args) {
		//primitive
		double d1=10.12;
		double d2=10.12;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1==d2);
		//System.out.println(d1.equals(d2));
		//wrapper clss
		Double D1=10.12;//java 5.0  左 java.lang.Double <---->右 double
		Double D2=10.12;//AutoBoxing
		/*java 4.0以前*/
		//Double D1=10.12;//boxing
		//Double D2=10.12;
		System.out.println("D1="+D1);
		System.out.println("D2="+D2);
		System.out.println(D1==D2);
		System.out.println(D1.equals(D2));

		String x="12.12";
		Double D=new Double(x);
		System.out.println(10+D);
	}
}