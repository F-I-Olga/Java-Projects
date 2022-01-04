//Ingabire Olga

public class Driver{
	public static void main(String[] args){
		
		StringLab  new1= new StringLab();
	
		//Split Strings
		System.out.println("Testing Split String");
		new1.splitTheString("JavaIsFun");
		new1.splitTheString("FunWithJava");
		String t = "";
		String [] tmp = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(int j = 0; j < 25; j++){
			int rand = (int)(Math.random()*tmp.length);
			t = t + tmp[rand];
		}
		new1.splitTheString("Word_" + t);
		
		//Compare Strings
		System.out.println("\nTesting Compare String:");
		String s1 = "cat";
		String s2 = "cat";
		String s3 = new String("cat");
		System.out.println(new1.compareString(s1,s2));//Should print true
		System.out.println(new1.compareString(s1,s3));//Should print true
		
		//strings within strings
		System.out.println("\nTesting Strings Within Strings");
		String s4 = "Concatenate";
		String s5 = "dog";
		System.out.println(new1.stringInString(s4,s3));//Should print true
		System.out.println(!new1.stringInString(s4, s5));//Should print true
		
		//print suu pattern
		System.out.println("\nTesting Print SUU Pattern");
		new1.printSUUPattern(0);
		new1.printSUUPattern(1);
		new1.printSUUPattern(2);
		new1.printSUUPattern(3);
		
		//lower case
		System.out.println("\nTesting to Lower Case");
		new1.printLower("CAT");//should print cat
		new1.printLower("dog");//should print dog
		
		//replace0s
		System.out.println("\nTesting Replace 0s");
		System.out.println(new1.replace0s("L00t")); //should print Loot
		System.out.println(new1.replace0s("0000")); //should print oooo
		System.out.println(new1.replace0s("LamaLama")); //should print LamaLama

	}
}