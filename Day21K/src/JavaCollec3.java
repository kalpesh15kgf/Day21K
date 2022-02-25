import java.util.LinkedList;
import java.util.Stack;
public class JavaCollec3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> kj = new LinkedList<>();
		kj.add(210);
		kj.add(220);
		kj.add(230);
		kj.add(240);
		kj.add(250);
		kj.add(260);
		System.out.println(kj);
		kj.addFirst(200);
		System.out.println(kj);
		kj.addLast(500);
		System.out.println(kj);
		kj.set(6, 90);
		System.out.println(kj);

	}

}
