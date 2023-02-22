package javapackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Vega 
{
//	int a;
//	static String firstname;
//	public  Vega(int a,String firstname) {
//	this.a= a;
//	this.firstname=firstname;
//	}
//	 
//	 public static void method1(int c) {
//		 int b=c;
//		 System.out.println(b); 
//		 
//	 }

	
	public static void main(String[] args) {

//         String str="ABCD";
//		 String rev="";
//		 int len=str.length();
//		 System.out.println(len);
////		 StringBuffer sb=new StringBuffer(str);
////		 System.out.println(sb.reverse());
//		 int i;
////		 for(i=len-1;i>=0;i--) 
////		 {
////			rev =rev+str.charAt(i) ;
////		 }
////		 System.out.println("reversed value:"+rev);
////		 char a[]=str.toCharArray();
////		 int len=a.length;
////		 System.out.println(len);
////		 for(i=len-1;i>=0;i--) {
////			 rev=rev+a[i];
////		 } 
////		
////		 System.out.println("reversed value:"+rev);
//		
//		 for(i=len;i>=0;i--) {
//			 rev=rev+str.charAt(i);
//			  
//		 }
//		 System.out.println(rev);
		
		int a=121;
		int rev=0;
		int org_a=a;
		String str=Integer.toString(a);
		int len=str.length();
		 System.out.println(len);
		 int i;
	 for(i=len-1;i>=0;i--) {
		 rev=rev*10+a%10;
		 a=a/10;
	
	}
	 System.out.println("reversed number is:"+rev);
	
	if(rev==org_a) {
		System.out.println("palindrome");
		
	}
	else {
		System.out.println("not palindrome");
	}
//		Scanner sc =new Scanner(System.in);
//				System.out.println("enter number:");
//				int num=sc.nextInt();
//				int rev1=0;
//				int org_num=num;
//				while(num!=0){
//				rev=rev*10+num%10;
//				num=num/10;
//				}
//				System.out.println("reverse num is:"+ rev);
//				
//	if(rev==org_num) {
//		
//		System.out.println("palindrome");
//	}
//	else {
//		System.out.println("not palindrome");
//	}
}
}