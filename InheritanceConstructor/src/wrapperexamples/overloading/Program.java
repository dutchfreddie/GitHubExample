package wrapperexamples.overloading;

public class Program {

	public static void main(String[] args) {
		
		short s1=1;
		short s2 = 2;
		
		PrimToWrap ptw = new PrimToWrap();
		ptw.overload1(s1,s2);
		
		Short ss1=7;
		Short ss2=8;
		WrapToPrim wtp = new WrapToPrim();
		wtp.overload1(ss1, ss2);

	}

}
