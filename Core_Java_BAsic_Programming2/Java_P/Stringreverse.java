import java.util.HashMap;
import java.util.Scanner;

public class Stringreverse {
	
	public static void main(String[] args) {
        
		// TODO38 Auto-generated method stub
//        String str;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter your String");
//        str = in.nextLine();
//        String[] token = str.split("");    //used split method to print in reverse order
//        for(int i=token.length-1; i>=0; i--)
//        {
//            System.out.print(token[i] + "");
//        }
//        
        
//		 int x, y, temp;
//	        System.out.println("Enter x and y");
//	        Scanner in = new Scanner(System.in);
//	        x = in.nextInt();
//	        y = in.nextInt();
//	        System.out.println("Before Swapping: x = " + x + " y = "+y);
//	        temp = x;
//	        x = y;
//	        y = temp;
//	        System.out.prtintln("After Swapping: x = " + x + " y = "+y);
//	         
//	
	
	String str1 = "This this is is done by is Saket is Saket";
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter your string ");
	String str2 = in.nextLine();
	String str = str2.toLowerCase();
	
    String[] split = str.split(" ");
     
            HashMap<String,Integer> map = new HashMap<String,Integer>();
    for (int i=0; i<split.length; i++) {
        if (map.containsKey(split[i])) {
            int count = map.get(split[i]);
            map.put(split[i], count+1);
        }
        else {
            map.put(split[i], 1);
        }
    }
    System.out.println("result: ");
    System.out.println(map);
    
//    map.put(split[1], map.get(split[1])+1);
//    System.out.println(map);
    
	}

}
