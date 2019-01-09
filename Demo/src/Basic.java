import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Scanner;

public class Basic {
	public static void main(String[] args) {
		
		String a=(5>5)?"hello":"hi";
		System.out.println(a);
		String s="hello";
		
		if(a.equals(s))
		{
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
	
		Basic b=new Basic();
		System.out.println(b); //Basic@7852e922
		
		
		/*String s1="h";
		int i=Integer.parseInt(s1);*/
		
		int k=1000;
		short b1=(short) k;
		System.out.println(b1);// 1000
		int l=(int) 1.6;
		System.out.println(l);// 1
		char c=126;
		System.out.println(c);// ~
		//Scanner sd=new Scanner("hi-hello-welcome-divya");
		Scanner sd=new Scanner(System.in);
		sd.useDelimiter("-");
	//System.out.println("enter name");
	//String t=sd.next();
	//System.out.println(t);
	/*while(sd.hasNext())
	{
		System.out.println(sd.next());
	}*/
	//System.out.println(10+30+20+hi-10);
	LocalDate d= LocalDate.now();
	System.out.println(d);
	LocalDate r=LocalDate.of(1996,10,15);
	System.out.println(r);
	LocalDate t=LocalDate.now().plusDays(6);
	System.out.println(t);
    System.out.println(t.isLeapYear());//false
    Period p=Period.of(1996, 10,10); //P1996Y10M10D
    System.out.println(p);
    System.out.println(p.plusDays(5));//P1996Y10M15D
    HashSet h=new HashSet();
    h.add(new Basic());
    h.add(new Basic());
    System.out.println(h.size()); //checks based on hash code so, ans is 2
    HashSet h1=new HashSet();
    Basic b11=new Basic();
    h1.add(b11);
    h1.add(b11);
    System.out.println(h1.size());// output is 1, hashcode is same 
    

		
			}
	

}
