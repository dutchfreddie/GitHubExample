package regularinnerclass;

import regularinnerclass.MyOuter.MyInner;
import regularinnerclass.SuperMyOuter.SuperMyInner;


public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//outerInnerExample();
		superSubOuterInnerExample();
		
		

		
	}
	
	static void outerInnerExample(){
		MyOuter mo = new MyOuter(1);
		mo.returnXfromOuter();
		MyInner mi = mo.createInner(10);
		mo.returnFromInner(mi);
		System.out.println("**");
		mi.changeX();
		mo.returnXfromOuter();
		mi.returnXFromInner();
		mi.returnYFromInner();
		System.out.println("****");
		MyOuter.MyInner momi = mo.new MyInner(20);
		momi.returnXFromInner();
		momi.returnYFromInner();
		System.out.println("******");
		momi.changeX();
		mo.returnXfromOuter();
		momi.returnXFromInner();
		momi.returnYFromInner();
		mi.returnXFromInner();
		mi.returnYFromInner();		
	}
	
	static void superSubOuterInnerExample(){
		SuperMyOuter smo = new SuperMyOuter(1);
		smo.returnXFromSuperOuter();
		SuperMyInner smoI = smo.createInnerI(20);
		smoI.returnFromSuperInner();
		
		SubMyOuter subMo = new SubMyOuter(60);
		subMo.returnXFromSuperOuter();
		SuperMyInner subMoI = subMo.createInnerI(100);
		subMoI.returnFromSuperInner();
		
		/*
		smo.returnXFromOuter();
		smo.getMyInner();
		SuperMyOuter.SuperMyInner smoI = smo.new SuperMyInner();
		smoI.returnX();
		
		System.out.println("");
		SubMyOuter subMo = new SubMyOuter();
		subMo.returnXFromOuter();
		subMo.getMyInner();
		*/
	}

}
