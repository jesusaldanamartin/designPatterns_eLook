package correo_elook;

public class Mailbox {

	private StrategySort st;
	
	public Mailbox(StrategySort st) {
		this.st = st;
	}
	
	public void show() {
	}
	
	private void sort() {
		// TODO Auto-generated method stub	
	}
	
	private boolean before(Email m1, Email m2) {
		
		return st.before(m1, m2);
	}
}	


