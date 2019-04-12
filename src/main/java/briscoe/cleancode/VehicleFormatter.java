package briscoe.cleancode;

public class VehicleFormatter {

	public static final String HTML_TEMPLATE = "<h1>Vehicle Details</h1>\n" +
	"<table>\n" +
	"<tr><th>VIN</th><th>Blacklisted</th><th>Make</th><th>Model</th><th>Year</th><th>color</th><th>Miles</th></tr>\n" +
	"<tr>\n" +
	"<td>%1$s</td><td>%2$s</td><td>%3$s</td><td>%4$s</td><td>%5$s</td><td>%6$s</td><td>%7$s</td>\n" +
	"</tr>\n" +
	"</table>";

	public static final String MARKDOWN_TEMPLATE = "# Vehicle Details\n" +
	"VIN | Blacklisted | Make | Model | Year | color | Miles\n" +
	"--- | --- | --- | --- | --- | --- | ---\n" +
	"%1$s | %2$s | %3$s | %4$s | %5$s | %6$s | %7$s";
	private final Vehicle vehicle;

	public static VehicleFormatter byVin(final String vin) {
		return new VehicleFormatter(vin);
	}

	public String toHtml() {
		return render(htmlTemplate());
	}

	public String toMarkdown() {
		return render(markdownTemplate());
	}

	private String render(final String template) {
		return String.format(template,
				vehicle.getVin(),
				vehicle.isBlacklisted(),
				vehicle.getMake(),
				vehicle.getModel(),
				vehicle.getYear(),
				vehicle.getColor(),
				vehicle.getMiles());
	}

	private String htmlTemplate() {
		final String html = HTML_TEMPLATE;

		return html.toString();
	}

	private String markdownTemplate() {
		final String markdown = MARKDOWN_TEMPLATE;
		return markdown.toString();
	}

	private VehicleFormatter(final String vin) {
		this.vehicle = VehicleDaoFactory.vehicleDao().expectToFindOne(vin);
	}

}
