package briscoe.cleancode;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Vehicle {

	private final String vin;
	private final boolean blacklisted;
	private final String make;
	private final String model;
	private final Integer year;
	private final int miles;
	private final Color color;

	public static class Builder {

		private final String vin;
		private final boolean blacklisted;
		private String make;
		private String model;
		private Integer year;
		private Color color;
		private int miles;

		public Builder(final String vin, final boolean blacklisted) {
			this.vin = vin;
			this.blacklisted = blacklisted;
		}

		public Builder make(final String make) {
			this.make = make;
			return this;
		}

		public Builder model(final String model) {
			this.model = model;
			return this;
		}

		public Builder year(final Integer year) {
			this.year = year;
			return this;
		}

		public Builder color(final Color color) {
			this.color = color;
			return this;
		}

		public Builder miles(final Integer miles) {
			this.miles = miles;
			return this;
		}

		public Vehicle build() {
			return new Vehicle(this);
		}

	}

	public String getVin() {
		return vin;
	}

	public boolean isBlacklisted() {
		return blacklisted;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public Integer getYear() {
		return year;
	}

	public int getMiles() {
		return miles;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(vin).toHashCode();
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Vehicle))
			return false;
		final Vehicle other = (Vehicle) obj;
		return StringUtils.equalsIgnoreCase(vin, other.vin);
	}

	private Vehicle(final Builder builder) {
		this.vin = builder.vin;
		this.blacklisted = builder.blacklisted;
		this.make = builder.make;
		this.model = builder.model;
		this.year = builder.year;
		this.color = builder.color;
		this.miles = builder.miles;
	}
}
