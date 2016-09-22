package nl.frederik.observer.extended;

public class MyTopicSubscriber implements Observer {	
	
    private String name;
    private Subject topic;
    
    private ITest test;
    
    public MyTopicSubscriber(ITest test){
    	this.test=test;
    }
     
    public MyTopicSubscriber(String nm){
        this.name=nm;
    }
    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(test.toUpperCase()+":: No new message");
        }else
        System.out.println(test.toUpperCase() +":: Consuming message::"+msg);
    }
 
    @Override
    public void setSubject(Subject sub) {
        this.topic=sub;
    }
 
}
