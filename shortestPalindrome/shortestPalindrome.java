package shortestPalindrome;

import java.util.*;

public class shortestPalindrome {
	private static Scanner scan;
	
	public static void main(String[] a){
	while(true){	
		System.out.print("enter: ");
		scan = new Scanner(System.in);
		String s = scan.nextLine();
	
		int j = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == s.charAt(j)) { 
				j += 1; 
				//System.out.println(s + " is already a palindrome");
			}
			else{
			
				for (int i1 = s.length() - 1; i1 >= 0; i1--) {
					String bob = s.substring(0,j+1);
					//System.out.println(bob);
					String reverse = new StringBuffer(bob).reverse().toString();
					String tim = s + reverse;
					String alex = new StringBuffer(tim).reverse().toString();
					//System.out.println(tim);
					if(tim.equals(alex)){
						System.out.println("Palindrome: " + tim);
						System.out.println("# of characters added: "+ bob.length());
						break;
					
					}
					else{
						j +=1;
					}
				}
				break;
			}
			System.out.println(s + " is already a palindrome");	
			break;
		}
		}
		
	}
}