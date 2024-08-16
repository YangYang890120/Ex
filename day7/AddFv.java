class AddFv
{
	public static void main(String[] args) {
		System.out.println(Fv.CompanyName());
		System.out.println(Fv.Title());
		//Fv.pv=500000;//在new之前先輸入pv
		Fv.setPv(200000);//
		Fv f1=new Fv(0.015,1);
		Fv f2=new Fv(0.014,2);
		Fv f3=new Fv(0.013,3);
		Fv f4=new Fv(0.012,4);//最後面輸入的pv會套給所有人做使用

		f1.show();
		f2.show();
		f3.show();
		f4.show();
		System.out.println("================");
		System.out.println(Fv.CompanyName());
		System.out.println(Fv.Title());
		//Fv.pv=200000;
		Fv.setPv(500000);
		f1.setR(0.02);
		f1.show();
		f2.show();
		f3.show();
		f4.show();
		System.out.println("x*y="+Fv.cal(10,60));

	}
}