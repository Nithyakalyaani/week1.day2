package week1day2;

public class RemoveDuplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String text="We learn java basics as a part of java sessions in java week1";
		int count=0;
		String [] text1=text.split(" ");
		
		for(int i=0;i<text1.length;i++)
			{
			count=0;
		
			for(int j=0;j<text1.length;j++)
			{
				if(text1[i].equals(text1[j]))
				{
					count++;
					
				}
			}
				if (count>1)
				{
					text=text.replace(text1[i], "");
				}
				else
					System.out.println("" +text1[i]);
					
					
				}
			}
		}
	


