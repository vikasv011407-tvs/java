package vikas;

public class v {
	
	public static void main(String[] args) {
		
		int a=5;
		int b=a++ + ++a;
		System.out.println(b);
		
		a=7;
		String s1=(a%2==0)?"the number is even":"the number is odd";
		System.out.println(s1);
		
		a=15;
		b=1;
		int d=20;
		System.out.println(a%3==0 && a%15==0);
		System.out.println(b%3==0 && a%15==0);
		System.out.println(b%3==0 && b%15==0);
		System.out.println(d%2==0 && d%5==0);
		System.out.println(d%2==0 | d%15==0);
		
		a=8;
		
		System.out.println(a*2==16 && a%4==0);
		
		a=7;
		b=2;
		
		System.out.println(a/b);
		System.out.println((double)a/b);
		
		a=57;
		b=40;
		
		System.out.println(a&b);
		System.out.println(a/b);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(~-a);
		
		System.out.println(a<<6);
		System.out.println(a>>7);
		
		a=20;
		 if(a==15) {
			 System.out.println("a is 15");
		 }
		 else {
			 System.out.println("a is not equal to 15");
		 }
		 
		 float t=9.00f;
		 
		 if(t<=10.00f) {
			 System.out.println("go to school");
		 }
		 else {
			 System.out.println("I'm today school leave");
		 }
		 
		 a=10;
		 
		 if(a%2==0) {
			 System.out.println("a number is greater than 0");
		 }
		 else {
			 System.out.println("a number is not greater than 0");
		 }
		 int age=25;
		 if(age>=18) {
			 System.out.println("Adult");
		 }
		 else {
			 System.out.println("No Adult");
		 }
		 
		 a=49;
		 if(a%7==0) {
			 System.out.println("positive");
		 }
		 int amount=1100;
		 
		 if(amount>=1000) {
			 System.out.println("Eliguble for discount");
		 }
		 else {
			 System.out.println("not eligible for discount");
		 }
		 
		 int y=2024;
		 if(y%4==0) {
			 System.out.println("the year is divisible by 4");
		 }
		 else {
			 System.out.println("the not year is divisible by 4");
		 }
		 
		 int td=100;
		 if(td>=90 & d<=110) {
			 System.out.println("Two digit number");
		 }
		 String s=null;
		 
		 if(s==null) {
			 System.out.println("empty");
		 }
	}
}
