


public class St {
	public static void main(String[] args) {
		
	
StringBuffer sb=new StringBuffer();

StringBuffer sb1=new StringBuffer("xy");
sb=sb1;
//System.out.println(sb.equals(sb));
//System.out.println(sb==sb1);



String s="xy";
String s1="xy";
String s2=new String("xy");
System.out.println(s==s2);
 
System.out.println(s.equals(s1));
System.out.println(s==s1);
//System.out.println(s.equals(sb1));


StringBuilder o=new StringBuilder("xy");
StringBuilder o1=new StringBuilder("xy");
//System.out.println(o.equals(o1));

//System.out.println(o==o1);

}
}
