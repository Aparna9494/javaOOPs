class StringManipulation{
public static void main(String[] args){
	String str="Hello,world!";
	int length=str.length();
	System.out.println("Length:"+length);
	
	String uppercase=str.toUpperCase();
	System.out.println("Uppercase:"+uppercase);
	
	String Lowercase=str.toLowerCase();
	System.out.println("Lowercase:"+Lowercase);
	
	String replaced=str.replace('o','x');
	System.out.println("Replaced:"+replaced);
	
	String substring=str.substring(7,12);
	System.out.println("Substring:"+substring);
	boolean startsWith=str.startsWith("Hello");
	System.out.println("starts With Hello:"+startsWith);
	
	boolean endsWith=str.endsWith("world");
	System.out.println("Ends With world:"+endsWith);
	
	String trimmed="Hello, world!".trim();
	System.out.println("trimmed:"+trimmed);
	
}

}
