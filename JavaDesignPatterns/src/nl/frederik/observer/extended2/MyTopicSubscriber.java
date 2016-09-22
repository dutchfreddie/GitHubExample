package nl.frederik.observer.extended2;

public class MyTopicSubscriber implements Observer {
    
	
	
	
    private String name;
    private Subject topic;
     
    public MyTopicSubscriber(String nm){
        this.name=nm;
    }
    @Override
    public void update() {
       IOutsideClass msg = (IOutsideClass) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name+":: No new message");
        }else
        System.out.println(name+":: Consuming message::"+msg.executeDb());
    }
 
    @Override
    public void setSubject(Subject sub) {
        this.topic=sub;
    }
 
}
