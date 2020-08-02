package wrapper_classes;

public class WrapperDemo {
	public static void main(String[] args) {
		byte b1=12;
		Byte b=new Byte(b1);
		double d=b.doubleValue();
		System.out.println(d);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.parseByte("127"));
		
		Short s=new Short((short)456);
		
		
		
	    Integer i=new Integer(45683);
	    System.out.println(Integer.toString(56)+2);
	    System.out.println(Integer.parseInt("58")+2);
	    
	    Character c=new Character('a');
	    
	    System.out.println(Character.isWhitespace(' '));
	    System.out.println(Character.isLowerCase('a'));
	    
	    String st="FHGDF324awfdHFJNLK";
	    char[] ch=st.toCharArray();
	    
	    for (int j = 0; j < ch.length; j++) {
			if(Character.isUpperCase(ch[j]))
			{
				System.out.println("Upper case: "+ch[j]);
			}else if(Character.isLowerCase(ch[j]))
			{
				System.out.println("Lower case: "+ch[j]);
			}
		}
	}
}