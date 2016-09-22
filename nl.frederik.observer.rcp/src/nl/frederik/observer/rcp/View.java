package nl.frederik.observer.rcp;


import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import nl.frederik.observer.rcp.observers.IOutsideClass;
import nl.frederik.observer.rcp.observers.MyTopic;
import nl.frederik.observer.rcp.observers.MyTopicSubscriber;
import nl.frederik.observer.rcp.observers.Observer;
import nl.frederik.observer.rcp.observers.OutsideClass;




public class View extends ViewPart {
	public static final String ID = "nl.frederik.observer.rcp.view";
	private MyTopic topic;
	private Text text1;
	private Text text2;
	private Text text3;

	
	public void createPartControl(Composite parent) {
		
		GridLayout layout = new GridLayout(4,true);
		parent.setLayout(layout);
		Button btn = new Button(parent,SWT.PUSH);
		btn.setText("Testing");
		GridData gd2 = new GridData(SWT.FILL,SWT.FILL,true,true);
		btn.setLayoutData(gd2);
		btn.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
					
				Display.getDefault().asyncExec( new Runnable(){

					@Override
					public void run() {
						IOutsideClass oc = new OutsideClass();
				        String message = oc.executeDb();
				        //now send message to subject
				        topic.postMessage(message);
				        text1.setText(message.substring(0,20));
				        text2.setText(message.substring(0,50));
				        text3.setText(message.substring(0,100));
					}
				});	
		         
		        
				
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		text1 = new Text(parent,SWT.BORDER);
		text1.setText("text1");
		GridData gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		text1.setLayoutData(gd);
		text2 = new Text(parent,SWT.BORDER);
		text2.setText("text2");
		gd=new GridData(SWT.FILL,SWT.FILL,true,true);
		text2.setLayoutData(gd);
		text3 = new Text(parent,SWT.BORDER);
		text3.setText("text3");
		gd=new GridData(SWT.FILL,SWT.FILL,true,true);
		text3.setLayoutData(gd);
		
		
		
		//create subject
        topic = new MyTopic();
         
        //create observers
        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");
         
        //register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);
         
        //attach observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		
	}
}