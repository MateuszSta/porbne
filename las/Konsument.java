package las;
import Grzyby.Grzyb;
import Grzyby.GrzybTrujacy;

import java.util.Random;

public class Konsument {
	public Las las;
	
	public Konsument(Las las) {
		this.las=las;
	}
	
	public boolean konsumujGrzyby() {
		for(int i=0;i<new Random().nextInt(51)+50;i++) {
			Grzyb grzyb=las.zbierzGrzyba();
			if(grzyb!=null) {
				grzyb.ugotoj();
				if(grzyb.czyTrujacy()) {
					System.out.println("uuups");
					return true;
				}
				else {
					System.out.println("mniam");
				
					
				}
			}
		}
		return false;
	}
}
