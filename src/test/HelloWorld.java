package test;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		String str = "Apoorv meets Vedu";
		String arr[]= str.split(" ");
		String result = "";
		for(int i=arr.length-1; i>=0; i--)
		{
			result = result + arr[i] + " ";
			System.out.println("The result is: "+result.trim());
		}
		

	}

}
