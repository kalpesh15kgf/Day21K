import java.util.Stack;
public class JavaCollec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> kj = new Stack<>();
		kj.add("Hello");
		kj.add("bro");
		kj.add("Welcome");
		kj.add("Kalpesh");
		kj.add("Jadhav");
		
		System.out.println(kj);
		kj.pop();
		kj.pop();
		
		System.out.println(kj);
		kj.peek();
		
		System.out.println(kj);
	}

}
