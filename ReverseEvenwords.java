package week1day2;

public class ReverseEvenwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test="I am a software tester";
		String[] test1=test.split(" ");
		for( int i=0;i<test1.length;i++)
		{
			if(i%2!=0)
			{
				char[] arr=test1[i].toCharArray();
				for (int j=arr.length-1;j>=0;j--)
				{
					System.out.print("" +arr[j]);
				}
			}
		
				else
				{
					System.out.print("" +test1[i] + "");
				}
			
				
		}
	}
}

