class Add1
{
	public static void main(String[] args) {
		Member[] m=new Member[3];
		m[0]=new Member("a","taipei");
		m[1]=new Member("b","taipei");
		m[2]=new Member("c","taipei");

		System.out.println(m);

		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[0]+"\t"+m[0].show());

		}

		System.out.println("============");
		System.out.println(m);
		for(Member o:m)
		{
			System.out.println("\t"+o+"\t"+o.show());
		}
		//System.out.println(m[0]+"\t"+m[0].show());

		/*Member abc=new Member("a","taipei");
		Member def=new Member("b","taipei");
		Member tt=new Member("c","taipei");

		System.out.println(abc+"\t"+abc.show());
		System.out.println(def+"\t"+def.show());
		System.out.println(tt+"\t"+tt.show());*/

		/*Member m=new Member("a","台北");
		System.out.println(m.show());*/
	}
}