package collectionexamples.queue_dequeue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Program {

	public static void main(String...strings){
		
		String[] array = {"1","2","3","4","5"};
		List<String> list = Arrays.asList(array);
		//exampleQueue(list);
		exampleDeQueue(list);

		
	}
	
	static void exampleQueue(List<String> list){
		System.out.println("Queue-example");
		Queue<String> queue = new ConcurrentLinkedQueue<>(list);
		System.out.println("added: " + queue.add("9"));
		System.out.println("offer: " + queue.offer("9"));
		printOutList(queue);
		System.out.println();
		System.out.println("peek " + queue.peek());
		System.out.println("element " + queue.element());
		System.out.println("remove " + queue.remove());
		System.out.println("poll " + queue.poll());
		printOutList(queue);
	}
	
	static void exampleDeQueue(List<String> list){
		System.out.println("DeQue-example");
		Deque<String> queue = new ConcurrentLinkedDeque<>(list);
		System.out.println("added: " + queue.add("9"));
		System.out.println("offer: " + queue.offer("9"));
		printOutList(queue);
		System.out.println();
		System.out.println("peek " + queue.peek());
		System.out.println("element " + queue.element());
		System.out.println("remove " + queue.remove());
		System.out.println("poll " + queue.poll());
		printOutList(queue);
	}
	
	static void printOutList(Queue<?> list ){
		for(Object o:list){
			System.out.print(o.toString() + " ");
		}
	}
}
