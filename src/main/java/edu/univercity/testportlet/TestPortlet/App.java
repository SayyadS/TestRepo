package edu.univercity.testportlet.TestPortlet;

/**
 * Hello world!
 *
 */
public class App 

{

	public String reverseString(String src) {
		// TODO Auto-generated method stub
		 return new StringBuilder(src).reverse().toString();	}
	
    public static void main( String[] args )
    {
    	final String str = "Hello!";
        App appObject = new App();

        System.out.println("My Demo Project");
        System.out.println("The reverse string of \"" + str + "\" is \"" +appObject.reverseString(str) + "\"");
    }

	
}
