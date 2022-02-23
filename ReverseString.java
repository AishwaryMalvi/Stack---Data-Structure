package Stack;
import java.util.Stack;
public class ReverseString {

	public static String reverseString(String str) {
		Stack <Character> Stack = new Stack<>(); 
		char[] chars = str.toCharArray();
		for(char cha : chars) {
			Stack.push(cha);
		}
		for(int ctr = 0; ctr<str.length(); ctr++) {
			chars[ctr] = Stack.pop();
		}
		return new String(chars);
	}
	public static void main(String[] args) {
		String str = "Aishwary";
		System.out.println(str);
		System.out.println(reverseString(str));

	}

}
