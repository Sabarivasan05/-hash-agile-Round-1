import java.util.*; 
public class Main { 
public static void main(String[] args) { 
     Scanner obj = new Scanner(System.in); 
     System.out.print("Enter a String : "); 
     String s = obj.nextLine(); 
     System.out.print("Enter the value of k : "); 
  int k = obj.nextInt(); 
  if (s.length() == 0 || s == null) { 
      System.out.println("Invalid String..."); 
      System.exit(0); 
  } 
  k = k % s.length(); 
  if (k == s.length()) { 
      System.out.println("String after rotated : " + s); 
      System.exit(0); 
  } 
  StringBuilder sb = new StringBuilder(s); 
  for (int i = 0; i < k; i++) { 
      char ch = sb.charAt(0); 
      sb.deleteCharAt(0); 
      sb.append(ch); 
  } 
  System.out.println("String after rotated : " + sb.toString()); 
 } 
}