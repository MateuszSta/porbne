package Grzyby;



public abstract class GrzybTrujacy extends Grzyb{
	protected String toksyny;
	
	public GrzybTrujacy() {
		super();
		if(this instanceof MuchomorSromotnikowy) {
			if(this.masa<50) {
				this.toksyny="zabojcze";
			}
			else {
				this.toksyny="wyjatkowo zabojcze";
			}
		}
		else {
			this.toksyny="trujace";
		}
		
	}
	
	
}
