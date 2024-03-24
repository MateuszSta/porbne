package Grzyby;

import java.util.Random;

public abstract class Grzyb {
	protected String twardosc;
	protected int masa;
	
	public Grzyb() {
		if(this instanceof MuchomorCesarski){
			this.twardosc="twardy";
		}
		else {
			switch(new Random().nextInt(3)) {
				case 0:
					this.twardosc="twardy";
					break;
				case 1:
					this.twardosc="sredniotwardy";
					break;
				case 2:
					this.twardosc="miekki";
					break;		
			}
		}
		if(this instanceof MuchomorKolczastoglowy) {
			this.masa=new Random().nextInt(26)+25;
		}
		else if(this instanceof MuchomorCesarski) {
			this.masa=new Random().nextInt(26)+50;
		}
		else {
			this.masa=new Random().nextInt(51)+25;
		}
		
	}
	
	public void ugotoj() {
		this.twardosc="miekkie";
	}
	
	public abstract boolean czyTrujacy();
}
