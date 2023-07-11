package day01.practice;

public class AccessModifier {
	public String a = "a";
	public String b = "b";
	public String c = "c";
	public static String d = "d";

	public static void main(String[] args) {
		AccessModifier accessModifier = new AccessModifier();
		System.out.println(accessModifier.a);
		System.out.println(accessModifier.b);
		System.out.println(accessModifier.c);
		System.out.println(d);
	}
}