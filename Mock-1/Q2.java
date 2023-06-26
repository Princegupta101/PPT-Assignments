import java.util.*;
public class Main {
	public static int fristChar(String s){
	     int[] count = new int[26];
        for(int i=0; i<s.length();i++)
        {
          count[s.charAt(i) -'a']++;
          }
     for(int i=0; i<s.length();i++)
        {
          if(count[s.charAt(i) -'a']==1){
            return i;
              
              }    
          }   
	    return -1;
	}
	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
          System.out.println(fristChar(s));   
    }
    
}
