package chapter03;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();

		stack.push("�鸮");
		stack.push("�����");
		System.out.println(stack.peek());
		stack.push("������");
		System.out.println(stack.pop() + "\n");
		stack.push("��浿");

		while (stack.isEmpty() == false) {
			String s = stack.pop();
			System.out.println(s);
		}
	}

}