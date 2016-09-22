package javalaunch;

import java.util.*;
public class TestProps {
	public static void main(String[] args) {
			Properties p = System.getProperties();
			p.setProperty("myProp2", "myValue2");
			p.setProperty("myProp3", "myValue3");
			p.list(System.err);
	}
}
