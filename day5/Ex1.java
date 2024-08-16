/*
Compiler
1->內部函式庫-->java.lang.*
2->同一資料夾
*/
import java.util.Scanner;
import java.util.Date;
//import java.util.*;不建議
class Ex1
{
	public static void main(String[] args) {
		java.lang.Thread t=new java.lang.Thread();//絕對路徑
		Thread t1=new Thread();//相對路徑

		//java.util.Scanner sc=new java.util.Scanner(System.in);
		Scanner sc=new Scanner(System.in);//相對路徑-->import
		Date d=new Date();
		System.out.println(d);
	}
}