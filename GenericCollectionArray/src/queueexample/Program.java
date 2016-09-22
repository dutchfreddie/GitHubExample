package queueexample;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Program {

	public static void main(String[] args) {
		
		Deque<String> loginSequence = new LinkedList<String>();
		loginSequence.add("Harrison");
		loginSequence.add("McCartney");
		loginSequence.add("Starr");
		loginSequence.add("Lennon");
		returnInput(loginSequence.element());
		returnInput(loginSequence.peek());
		returnInput(loginSequence.getFirst());
		
	}
	
	private static void returnInput(String input){
		System.out.println(input);
	}

}
