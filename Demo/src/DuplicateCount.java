
public class DuplicateCount {
 public static void main(String argu[]) {

  String str = "w3schools";
  int cnt = 0;
 // char[] inp = str.toCharArray();
  System.out.println("Duplicate Characters are:");
  for (int i = 0; i < str.length(); i++) {
   for (int j = i + 1; j < str.length(); j++) {
    if (str.charAt(i)==str.charAt(j)) {
     System.out.println(str.charAt(j));
     cnt++;
     System.out.println(cnt);
     break;
    }
   }
  }
 }
}
