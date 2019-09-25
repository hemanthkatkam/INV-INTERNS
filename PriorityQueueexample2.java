package difconfig;

import java.util.PriorityQueue;

public class PriorityQueueexample2{

	public static void main(String[] args) {
		PriorityQueue<String> tom = new PriorityQueue<String>();
		tom.add("MSD");
		tom.add("VK");
		tom.add("KW");
		tom.add("BM");
		System.out.println(tom.element());
		System.out.println(tom.peek());
		for(String jk:tom)
		{
			System.out.println("Print for elements : "+jk);
		}
    tom.remove();
    tom.poll();
    System.out.println("After removing two elements");
    for(String kl:tom)
    {
    	System.out.println(kl);
    	System.out.println("Hello london");
    }
	}

}
