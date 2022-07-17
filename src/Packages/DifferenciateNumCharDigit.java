package Packages;

public class DifferenciateNumCharDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer special = new StringBuffer();
		
		StringBuffer digit = new StringBuffer();
		
		StringBuffer charr = new StringBuffer();
		
		String str = "etrifksb346819#@$@)$";
		
		for(int i=0;i<str.length();i++) {
			
			if(Character.isAlphabetic(str.charAt(i)))
				charr.append(str.charAt(i));
			else if(Character.isDigit(str.charAt(i)))
				digit.append(str.charAt(i));
			else
				special.append(str.charAt(i));
		}
		
		System.out.println(charr.toString());
		
		System.out.println(digit.toString());
		
		System.out.println(special.toString());

	}

}
