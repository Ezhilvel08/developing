package poly;

public class methodoverloading {

static int sumInt(int x,int y) {
		
		int z;
		z=x+y;
		return z;

}
      static double sumInt(double  x,double y) {
		
		double z=0;
		z=x+y;
		return z;
}
	public static void main(String[] args) {
		
		int x = sumInt(10, 20);
		System.out.println("sum Of Int :"+x);
		double y = sumInt(10.3,20.9);
		System.out.println("sum Of Double :"+y);
	}
	
}