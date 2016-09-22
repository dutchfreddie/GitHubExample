package singletonexample;

public class ProgramSingleton {

	public static void main(String[] args) {
		Singleton mySingleton = Singleton.getSingletonInner();
		System.out.println(mySingleton.toString());		
		mySingleton.returnX();
		mySingleton.addToX(10);
		mySingleton = null;
		mySingleton = Singleton.getSingletonInner();
		System.out.println(mySingleton.toString());		
		mySingleton.returnX();
		mySingleton.addToX(10);
		
		mySingleton.removeMySingletonInner();
		mySingleton = Singleton.getSingletonInner();
		System.out.println(mySingleton.toString());	
		mySingleton.returnX();
		mySingleton.addToX(10);
	}
	
	private static void createSingletonNormalClass(){
		Singleton mySingleton = Singleton.getSingleton();
		System.out.println(mySingleton.toString());
		
		mySingleton = Singleton.getSingleton();
		System.out.println(mySingleton.toString());
		
		mySingleton = null;
		mySingleton = Singleton.getSingleton();
		System.out.println(mySingleton.toString());	
		mySingleton.removeSingleton();
		mySingleton = Singleton.getSingleton();
		System.out.println(mySingleton.toString());	
		
		NormalClass nc = new NormalClass();
		System.out.println(nc.toString());
		
		nc = new NormalClass();
		System.out.println(nc.toString());
	}

	
	private static void additionalMethods(){
		Singleton mySingleton = Singleton.getSingleton();
		System.out.println(mySingleton.toString());		
		mySingleton.returnX();
		mySingleton.addToX(10);
		mySingleton = null;
		mySingleton = Singleton.getSingleton();
		System.out.println(mySingleton.toString());		
		mySingleton.returnX();
		mySingleton.addToX(10);
		
		mySingleton.removeSingleton();
		mySingleton = Singleton.getSingleton();
		System.out.println(mySingleton.toString());	
		mySingleton.returnX();
		mySingleton.addToX(10);
	}
}
