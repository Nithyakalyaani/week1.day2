package week1day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test="changeme";
		char[] charArray1=test.toCharArray();
		for(int i=0;i<charArray1.length;i++)
		{
			char ch=charArray1[i];
			if(i%2!=0)
			{
				ch =Character.toUpperCase(ch);
				
				
			}else
				System.out.println(ch);
		}
	}
}


