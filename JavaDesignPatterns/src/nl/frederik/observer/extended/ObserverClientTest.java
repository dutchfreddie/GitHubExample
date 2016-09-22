package nl.frederik.observer.extended;

public class ObserverClientTest {

	 public static void main(String[] args) {
	        //create subject
	        
		 ListSubsribers ls = new ListSubsribers();
		 
		 MyTopic topic = ls.getTopic();	         
	        //now send message to subject
	        topic.postMessage("New Message");
	        
	        ITest t1 = new Test("o1extra");
	        topic.postMessage("New Message After addition");
	        System.out.println();
	        //create observers
	        Observer obj1 = new MyTopicSubscriber(t1);	        
	        ls.addObserver(obj1);
	        topic.postMessage("New Message After addition");
	        
	    }
	 
	 private static void test1(){
		 
		//create subject
	        MyTopic topic = new MyTopic();
	         
	        ITest t1 = new Test("o1");
	        ITest t2 = new Test("o2");
	        ITest t3 = new Test("o3");
	        
	        //create observers
	        Observer obj1 = new MyTopicSubscriber(t1);
	        Observer obj2 = new MyTopicSubscriber(t2);
	        Observer obj3 = new MyTopicSubscriber(t3);
	         
	        //register observers to the subject
	        topic.register(obj1);
	        topic.register(obj2);
	        topic.register(obj3);
	         
	        //attach observer to subject
	        obj1.setSubject(topic);
	        obj2.setSubject(topic);
	        obj3.setSubject(topic);
	         
	        //check if any update is available
	        obj1.update();
	         
	        //now send message to subject
	        topic.postMessage("New Message");
		 
	 }
}
