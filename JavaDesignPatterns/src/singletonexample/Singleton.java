package singletonexample;

public class Singleton {
	
	private static Singleton mySingleton;
	private static int x;
	
	private Singleton(){
		x=1;
	}
	
	public static Singleton getSingleton(){
		if(mySingleton==null)
			mySingleton = new Singleton();
		
		return mySingleton;		
	}
	
	public  void removeSingleton(){
		mySingleton = null;
	}

	public void addToX(int y){
		x = x+y;
		System.out.println("x = " + x);
	}
	
	public void returnX(){
		System.out.println("x = " + x);
	}
	
	public static class SingletonInnerClass{
		public static Singleton mySingletonInner = new Singleton();
	}
	
	public static Singleton getSingletonInner(){
		return SingletonInnerClass.mySingletonInner;
	}
	
	public void removeMySingletonInner(){
		SingletonInnerClass.mySingletonInner=null;
	}
	
	
}
