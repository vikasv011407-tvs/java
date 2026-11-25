package first;

public class loop {
	public static void main(String[] args) {
		
//		Loop
		
		for (int i=0;i<5;i++) {
			System.out.println(i);
		}
		
		int a=0;
		int b=10;
		
		for (int j=0;j<5;j++) {
			a=a+j;
			b=b*j;	
		}
		System.out.println(a);
		System.out.println(b);
		
		for (int i=0;i>10;i--) {
			System.out.println(i);
			
		}
		
		String name="vikas";
		System.out.println(name);
		
		String na="Tharani";
		System.out.println(na.length());
		
		for (int i=0;i<na.length();i++) {
			
			System.out.println(na.charAt(i));
			
		}
		
//		While loop
		
//		Increament
		
		int c=1;
		while (c<11) {
			System.out.println(c);
			c+=1;
		}
		
//		Decreament
		
		int d=10;
		while (d>=1) {
			System.out.println(d);
			d-=1;
		}
		
//		Jumping Statement
		
		for (int i=0;i<=11;i++) {
			if(i==12) {
				break;
			}
			System.out.println(i);
		}
		
		for (int i=0;i<=11;i++) {
			if(i==6) {
				continue;
			}
			System.out.println(i);
		}
		
		int count=0;
		for(int i=1;i>=0;i++) {
			if (i%5==0) {
				count+=1;
				System.out.println(i+""+count);
			}
			
			else if (count==5) {
				break;
			}
		}
		
//		Do while loop
		
		int e=15;
		do {
			System.out.println(e);
			e+=1;
			
		}while(e<20);
		
			
	}

}
