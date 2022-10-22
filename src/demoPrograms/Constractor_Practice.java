package demoPrograms;

public class Constractor_Practice {

	int no;
	String name;
	Constractor_Practice(int no,String name)
	{
		this.no=no;
		this.name=name;
	}
	public static void main(String[] args) {
		/*Constractor_Practice s1 = new Constractor_Practice(101,"venky");
		Constractor_Practice s2 = new Constractor_Practice(102,"raja");
		//System.out.println(s1.no);
		//System.out.println(s1.name);
		System.out.println(s1.no+" "+s1.name);
		System.out.println(s2.no+" "+s2.name);*/
		
		String str[]= {"venky","satti","ganesh","naveen"};
		for(String aa:str)
		{
			System.out.println(aa);
		}
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
	}
	
}
