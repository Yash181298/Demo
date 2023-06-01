import java.util.Scanner;
class Array_Asciivowels
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size");
		int size=sc.nextInt();
		int []a=new int[size];
		System.out.println("Enter The Elements");
		for(int i=0;i<a.length;i++)
		{
			 a[i]=sc.next().charAt(0);
		}
		System.out.println("Ascii Value Of Vowels");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
			{
				System.out.println(a[i]);
			}
		}
	}
}