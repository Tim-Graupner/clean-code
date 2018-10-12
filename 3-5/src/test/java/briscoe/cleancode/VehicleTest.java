package briscoe.cleancode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VehicleTest {

	@Test
	public void notBlacklisted() {
		assertFalse(Vehicle.byVin("DOESNT_EXIST").isBlacklisted());
	}

	@Test
	public void isBlacklisted() {
		assertTrue(Vehicle.byVin("1HGBH41JXMN109186").isBlacklisted());
	}

}
