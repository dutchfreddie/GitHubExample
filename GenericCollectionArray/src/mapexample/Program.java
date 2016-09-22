package mapexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		String[] arrayS = {"f1","f2","f3","f4"};
		long[] arrayL = {1l,2l,3l,4l};
		
		Map<IPet,Boolean> map = new TreeMap<IPet,Boolean>();
		List<IPet> list = new ArrayList<IPet>();
		for(int x=0;x<arrayS.length;x++){
			IPet p = new Pet(arrayS[x],arrayL[x]);
			list.add(p);
			map.put(p, false);
		}
		
		Map<TwoPetObj,Boolean> mapA = new TreeMap<TwoPetObj,Boolean>();
		int loop = 0;
		boolean b = true;
		while(b){
			for(int x=loop+1;x<list.size();x++){
				IPet p1 = list.get(loop);
				IPet p2 = list.get(x);
				TwoPetObj tpo1 = new TwoPetObj(p1,p2);
				TwoPetObj tpo2 = new TwoPetObj(p2,p1);
				mapA.put(tpo1, false);
				mapA.put(tpo2, true);				
			}	
			loop++;
			if(loop==list.size())
				b=false;
		}
		
		int y = 1;
		for(Entry<TwoPetObj,Boolean> entry:mapA.entrySet()){
			IPet p1 = entry.getKey().getPet1();
			IPet p2 = entry.getKey().getPet2();
			boolean b2 = entry.getValue();
			System.out.println(y + ": " + p1.getName() + " " + p2.getName() + " " + b2);
			y++;
		}
		System.out.println("*****************");
		
		
	}
	
	private static void example1(){
		String[] arrayS = {"f1","f2","f3"};
		long[] arrayL = {1l,2l,3l};
		
		Map<IPet,Boolean> map = new TreeMap<IPet,Boolean>();
		List<IPet> list = new ArrayList<IPet>();
		for(int x=0;x<3;x++){
			IPet p = new Pet(arrayS[x],arrayL[x]);
			list.add(p);
			map.put(p, false);
		}
		/*
		 * Adding a list as key to a map returns an java.lang.ClassCastException
		Map<IPet[],Boolean> mapA = new TreeMap<IPet[],Boolean>();
		for(int i=1;i<3;i++){
			IPet p1 = list.get(0);
			IPet p2 = list.get(1);
			IPet[] arr = {p1,p2};
			mapA.put(arr, true);
		}
		
		
		Map<List<IPet>,Boolean> mapA = new TreeMap<List<IPet>,Boolean>();
		for(int i=1;i<3;i++){
			IPet p1 = list.get(0);
			IPet p2 = list.get(1);
			List<IPet> temp = new ArrayList<IPet>();
			temp.add(p1);temp.add(p2);
			mapA.put(temp, true);
		}
		*/
		
		String[] arrayS3 = {"f1","f2","f3"};
		String[] arrayS2 = {"f4","f5","f6"};
		
		
		Map<String[],Boolean> map3 = new TreeMap<String[],Boolean>();
		for(int x=0;x<3;x++){
			String[] array = {arrayS3[x],arrayS2[x]};
			map3.put(array,false);
		}
	}

}
