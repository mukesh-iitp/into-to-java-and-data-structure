package lecture2;

public class DataType {

	public static void main(String[] args) {
		
		char c='a';
		System.out.println(c);
		System.out.println(c+3);
		
		int i=c+10;
		//System.out.println(i);
		
		i=c;
		char abc=(char)i;
		
		long l=i;
		l=12345654321l;
		i=(int)l;
		System.out.println(l);
		System.out.println(i);

		double d=i;
		//i=d;
		
		float f=1.23f;		//1.23 is by default double
		//f=d;
		d=f;
				
		int j=100;
		
		

	}

}