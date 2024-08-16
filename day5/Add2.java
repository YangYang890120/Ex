class Add2
{
	public static void main(String[] args) {
		Order o0 =new Order("a",2,2);
		Order o1 =new Order("b",2,4);
		o0.show();
		o1.show();
		// o0.change1(4,3);
		// o1.change1(5,1);

		System.out.println("=========================");
		System.out.println("合計"+(o0.change2(5,3)+o1.change2(5,1)));
		//o1.ruler=-10;
		System.out.println("名子"+o1.getName());
		o1.setName("135413513");
		o0.show();
		o1.show();
	}
}