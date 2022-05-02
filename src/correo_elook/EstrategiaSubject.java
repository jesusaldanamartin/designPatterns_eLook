package correo_elook;

public class EstrategiaSubject implements StrategySort{

	@Override
	public boolean before(Email m1, Email m2) {
		
		return m1.from.compareTo(m2.from) < 0;
	}
}
