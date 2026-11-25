package first;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		
//		Array
		
		int a[]={1,2,3,4,5,6};
		
		System.out.println(a);
		System.out.println(a.length);
		System.out.println(a[1]);
		
		for (int i=0;i<a.length;i++){
		System.out.println(a[i]);
		}
	
	
//	Scanner
	
	Scanner sc=new Scanner (System.in);
	int b=sc.nextInt();
	System.out.println(b+80);
	System.out.println("Enter the name");
	String p=sc.next();
	System.out.println(p);
	
//	2nd types of Array
	
	int s[]=new int [5];
	System.out.println(s.length);
	s[1]=20;
	s[4]=40;
	
	for(int i=0;i<s.length;i++) {
		System.out.println(s[i]);
	}
		
//user input with Array
		
		Scanner cs= new Scanner (System.in);
		
		int c[]=new int [6];
		System.out.println(c.length);
		 for (int i=0;i<c.length;i++) {
			 
			 System.out.println("Enter the value"+i);
			 
			 c[i]=cs.nextInt();
			 System.out.println(c[i]);
			 
		 }
	      
		 for (int j=0;j<c.length;j++) {
			 System.out.println(c[j]);
		 }
	}
}
