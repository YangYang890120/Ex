class Ex4
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("請輸入國文成績");
		int chi = sc.nextInt();
		System.out.println("請輸入英文成績");
		int eng = sc.nextInt();
		System.out.println("請輸入數學成績");
		int math = sc.nextInt();
		int sum = chi+eng+math;

		if(sum>=200)
		{
			if(eng>=80)
			{
				System.out.println("國文="+chi+
				"\n英文="+eng+
				"\n數學="+math+
				"\n總分="+sum+
				"\n恭喜錄取");
			}
			else
			{
				System.out.println("國文="+chi+
				"\n英文="+eng+
				"\n數學="+math+
				"\n總分="+sum+
				"\n英文未達80,不予錄取");
			}
		}
		else
		{
			System.out.println("國文="+chi+
				"\n英文="+eng+
				"\n數學="+math+
				"\n總分="+sum+
				"\n總分未達200,不予錄取");
		}

	}
}