

public class Simple{
	public static void main(String[] args) {
		
		byte q=10;
		short w=20;
		int e=30;
		long r=400000000;
		float t=50;
		double y=600000000;
		char u='D';
		boolean i = true;

		System.out.println(q+"\t"+Byte.SIZE/8);
		System.out.println(w+"\t"+Short.SIZE/8);
		System.out.println(e+"\t"+Integer.SIZE/8);
		System.out.println(r+"\t"+Long.SIZE/8);
		System.out.println(t+"\t"+Float.SIZE/8);
		System.out.println(y+"\t"+Double.SIZE/8);
		System.out.println(u+"\t"+Character.SIZE/8);
		System.out.println(i);
	}
}