package stringprograms;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sbd=new StringBuilder("Hello");
		sbd.append(" I am learning selenium");
		System.out.println(sbd);
		sbd.delete(6, 20);
		System.out.println(sbd);
		
		sbd.insert(6, "we are learning ");
		
		System.out.println(sbd);
		
		System.out.println(sbd.length());
		
		System.out.println(sbd.reverse()); // this will reverse the string 
		
		System.out.println(sbd.reverse()); // this will again reverse reversed string
		
		StringBuffer sbf=new StringBuffer();
	}
}