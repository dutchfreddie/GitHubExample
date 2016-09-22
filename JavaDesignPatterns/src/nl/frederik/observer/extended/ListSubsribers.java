package nl.frederik.observer.extended;

public class ListSubsribers {
	
	private MyTopic topic;
	
	public ListSubsribers(){
		this.setTopic(new MyTopic());
		
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
	}

	public MyTopic getTopic() {
		return topic;
	}

	public void setTopic(MyTopic topic) {
		this.topic = topic;
	}
	
	public void addObserver(Observer newObserver){
		topic.register(newObserver);
		newObserver.setSubject(topic);
	}

}
