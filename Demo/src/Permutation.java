
public class Permutation {

    public static void main(String[] args) {
        permutation("add");
    }
    public static void permutation(String str) {
        permutation("", str);
    }
    // recursive method
    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0){
            System.out.println(prefix);
        }
        else {
            for (int i  = 0;  i < n;  i++){
                //System.out.println("prefix " + prefix + " i " + i);
                permutation(prefix + str.charAt(i), str.substring(0, i) 
                  + str.substring(i+1, n));
            }
        }
    }
}