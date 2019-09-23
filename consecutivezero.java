package consecutivezero;

import java.util.Scanner;

public class consecutivezero {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 int i=0,count=0;
		 int maxBinaryGap=0;
		 System.out.println("Enter decimal number:");
		 int n=sc.nextInt();
		 System.out.println("decimal number:" +n);
		 String changeBin=Integer.toBinaryString(n);
		 System.out.println("Decimal to Binary number:" +changeBin);
		 int b=changeBin.length();
		 System.out.println("length of binary:"+b);
		 for(i=0;i<changeBin.length();i++)
		 {
			 if(changeBin.charAt(i)=='1')
			 {
					if(count >= maxBinaryGap){
						maxBinaryGap = count;
					}
					count = 0;
				}else if(changeBin.charAt(i)== '0'){
					count++;
				}
			}
		         System.out.println("Maximum binary gap:"+maxBinaryGap);
	 }
}


