package las;

import Grzyby.Grzyb;
import Grzyby.MuchomorCesarski;
import Grzyby.MuchomorKolczastoglowy;
import Grzyby.MuchomorSromotnikowy;
import Grzyby.MuchomorSzarawy;

import java.util.Random;

public class Las {
	public Grzyb[][] grzyby;
	
	Random rn=new Random();
	
	public Las(int x,int y) {
		if(x<=0) {
			x=100;
		}
		if(y<=0) {
			y=0;
		}
		grzyby=new Grzyb[x][y];
		int kolumna=rn.nextInt(y);
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				if(Math.random()<0.2 && j!=kolumna) {
					switch(rn.nextInt(4)) {
						case 0:
							grzyby[i][j]=new MuchomorCesarski();
							break;
						case 1:
							grzyby[i][j]=new MuchomorKolczastoglowy();
							break;
						case 2:
							grzyby[i][j]=new MuchomorSromotnikowy();
							break;
						case 3:
							grzyby[i][j]=new MuchomorSzarawy();
							break;
					}
				}
				else {
					grzyby[i][j]=null;
				}
			}
		}
	}
	
	public Grzyb zbierzGrzyba() {
		int x=rn.nextInt(grzyby.length);
		int y=rn.nextInt(grzyby[0].length);
		Grzyb zebrany=grzyby[x][y];
		grzyby[x][y]=null;
		return zebrany;
	}
	
	
	
}
