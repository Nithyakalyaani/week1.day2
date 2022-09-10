package week1day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="madam";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			 rev=rev+ str.charAt(i);
		}
			 if(str.equals(rev))
			 {
				 System.out.println("It is a palindrome");
			 }
			 else
				 System.out.println("Not a palindrome");
			 
			
		}
	

}
