import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BattleshipTests {
	MediumBattleship medium;
	SmallBattleship small;
	LargeBattleship large;
	
	/*
	@Test
	void test() {
		fail("Not yet implemented");
	}
	*/
	
	@Test
	public void MediumBattleshipSize() {
		medium = new MediumBattleship();
		assert(medium.getSize()==2);
	}
	
	@Test
	public void SmallBattleshipSize() {
		small = new SmallBattleship();
		assert(small.getSize()==1);
	
	}
	
	@Test
	public void LargeBattleshipSize() {
		large = new LargeBattleship();
		assert(large.getSize()==3);
	
	}
}
