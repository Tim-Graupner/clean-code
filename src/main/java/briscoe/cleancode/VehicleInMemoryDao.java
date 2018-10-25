package briscoe.cleancode;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class VehicleInMemoryDao implements VehicleDao {

	private Set<Vehicle> vehicles;

	public VehicleInMemoryDao() {
		vehicles = new HashSet<>();

		vehicles.add(new Vehicle.Builder("1HGBH41JXMN109186", true)
				.color(Color.BLUE)
				.make("Honda")
				.model("civic")
				.year(2016)
				.build());
		vehicles.add(new Vehicle.Builder("2HGBH41JXMN109186", false)
				.color(Color.RED)
				.make("Ford")
				.model("fusion")
				.year(2006)
				.build());
		vehicles.add(new Vehicle.Builder("3HGBH41JXMN109186", true)
				.color(Color.GREEN)
				.make("Toyota")
				.model("sienna")
				.year(2014)
				.build());
		vehicles.add(new Vehicle.Builder("4HGBH41JXMN109186", false)
				.color(Color.BLUE)
				.make("GMC")
				.model("terrain")
				.year(2015)
				.build());
	}

	@Override
	public Vehicle findOne(final String vin) {
		final Optional<Vehicle> maybeVehicle = vehicles.stream().filter(vehicle -> vehicle.getVin().equalsIgnoreCase(vin)).findFirst();

		if(maybeVehicle.isPresent())
			return maybeVehicle.get();

		return null;
	}

}
