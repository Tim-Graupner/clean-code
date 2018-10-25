package briscoe.cleancode;

public enum Color {
	
	RED(255, 0, 0), GREEN(0, 128, 0), BLUE(0, 0, 255);
	
	private final int red;
	private final int green;
	private final int blue;

	private Color(final int red, final int green, final int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

}
