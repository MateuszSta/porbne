package Grzyby;

public class MuchomorSzarawy extends GrzybTrujacy{
	
	private int rok;
	
	public MuchomorSzarawy() {
		super();
		this.rok=1783;
	}
	
	@Override
	public void ugotoj() {
		super.ugotoj();
		this.toksyny="nieobecne";
	}
	
	@Override
	public boolean czyTrujacy() {
		if(toksyny=="nieobecne") {
			return false;
		}
		return true;
	}
}
