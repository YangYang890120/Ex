class Exam1
{
	public static void main(String[] args) {
		
		A a=new A();//is-a A,is-a Student 確定此子類別具有多少class參考文件
					//has-a word, has-a show(),has-a name,has-a chi 確定完具有的class類型數,是JRE執行時判斷是否有此功能可用的依據
		B b=new B();//is-a B,is-a Student

		a.show();
		b.show();
	}
}