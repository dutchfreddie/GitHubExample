package ioexample.streaming;

import java.io.Serializable;

public class Collar implements Serializable{

	private int sizeCollar;
	
	public Collar (int sizeCollar){
		this.setSizeCollar(sizeCollar);
	}

	public int getSizeCollar() {
		return sizeCollar;
	}

	public void setSizeCollar(int sizeCollar) {
		this.sizeCollar = sizeCollar;
	}
	
	@Override
	public String toString(){
		return "color-size: " + sizeCollar;
	}
	
}
