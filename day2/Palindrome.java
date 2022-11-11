package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
	String a="34345";
	String temp="";
	for (int i =a.length()-1;i>=0; i--) {
		temp=temp+a.charAt(i);
		System.out.println(temp);
	}
	if (a.equals(temp))
	{
	System.out.println("This is a Palindrome");
	}
	else 
		{
		System.out.println("This is not a Palindrome");
	

	}

}

}