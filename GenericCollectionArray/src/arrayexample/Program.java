package arrayexample;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		
		int[] arrayInt = new int[5];
		Arrays.fill(arrayInt, 5);
		for(int x:arrayInt){
			System.out.println(x);
		}
		
		Arrays.fill(arrayInt, 15);
		for(int x:arrayInt){
			System.out.println(x);
		}
		
		int[] desTArray = new int[7];
		System.arraycopy(arrayInt, 2, desTArray, 3, 2);
		for(int x:desTArray){
			System.out.println(x);
		}
		
		
		int [][] arrayIntMulti = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int xx = arrayIntMulti.length;
		System.out.println(xx);
		
		for(int x=0;x<4;x++){
			for(int y=0;y<3;y++){
				System.out.println("Output: " + x + " " + y + " " + arrayIntMulti[x][y]);
			}
		}
		System.out.println();
		int[][][] DMultiArray = {{{1,2,3,50},{4,5,6,60},{7,8,9,70}},{{11,12,13,80},{14,15,16,90},{17,18,19,100}}};
		
		int[][][] DMultiArray2  = {arrayIntMulti,arrayIntMulti};
		
		for(int x=0;x<2;x++){
			for(int y=0;y<3;y++){
				for(int z=0;z<4;z++){
					System.out.println("Output: " + x + " " + y + " " + z + " " + DMultiArray[x][y][z]);	
				}
				
			}
		}
		
		

	}

}
