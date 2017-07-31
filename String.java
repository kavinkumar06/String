# String
import java.util.Scanner;
public class Isomorphic {
boolean flag=true;
	boolean result(String a,String b)
	{
		for(int i=0;i<a.length();i++)
		{
			for(int j=1;j<a.length();j++)
			{
			if(a.charAt(i)==a.charAt(j))
			{
				if(b.charAt(i)==b.charAt(j))
				{
					continue;
				}
				else
				{
					flag=false;
					break;
				}
			}
			else
			{
				if(b.charAt(i)!=b.charAt(j))
				{
					continue;
				}
				else
				{
					flag=false;
					break;
				}
			}
			}
		}
		
		return flag;
		
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Isomorphic string");
		System.out.println("Enter two strings");
		String s1=s.nextLine();
		String s2=s.nextLine();
		if(new Isomorphic().result(s1, s2))
		{
			System.out.println("Strings are isomorphic");
		}
		else
		{
			System.out.println("Strings are not isomorphic");
		}
	}

}
