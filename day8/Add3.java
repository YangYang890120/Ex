class Add3
{
	public static void main(String[] args) {
		Member [][] m=new Member[2][];
		m[0]=new Member[3];
		m[1]=new Member[4];

		m[0][0]=new Member("a","taipei");
		m[0][1]=new Member("b","taipei");
		m[0][2]=new Member("c","taipei");

		m[1][0]=new Member("d","taipei");
		m[1][1]=new Member("e","taipei");
		m[1][2]=new Member("f","taipei");
		m[1][3]=new Member("g","taipei");

		System.out.println(m);

		for(int i=0;i<m.length;i++)
		{
			System.out.println("\t"+m[i]);
			for(int j=0;j<m[i].length;j++)
			{
				System.out.println("\t\t"+m[i][j]+"\t"+m[i][j].show());
			}
		}
		System.out.println("=============================");	
		System.out.println(m);

		for(Member[] o:m)
		{
			System.out.println("\t"+o);
			for(Member u:o)
			{
				System.out.println("\t\t"+u+"\t"+u.show());
			}
		}
	}
}