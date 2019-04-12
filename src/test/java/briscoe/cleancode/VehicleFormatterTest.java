package briscoe.cleancode;

import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleFormatterTest {

	@Test
	public void toHtml() {
		final String content = VehicleFormatter.byVin("1HGBH41JXMN109186").toHtml();
		assertEquals("<h1>Vehicle Details</h1>\n" +
		"<table>\n" +
		"<tr><th>VIN</th><th>Blacklisted</th><th>Make</th><th>Model</th><th>Year</th><th>color</th><th>Miles</th></tr>\n" +
		"<tr>\n" +
		"<td>1HGBH41JXMN109186</td><td>true</td><td>Honda</td><td>civic</td><td>2016</td><td>BLUE</td><td>0</td>\n" +
		"</tr>\n" +
		"</table>", content);
	}

	@Test
	public void toMarkdown() {
		final String content = VehicleFormatter.byVin("1HGBH41JXMN109186").toMarkdown();
		assertEquals("# Vehicle Details\n" +
		"VIN | Blacklisted | Make | Model | Year | color | Miles\n" +
		"--- | --- | --- | --- | --- | --- | ---\n" +
		"1HGBH41JXMN109186 | true | Honda | civic | 2016 | BLUE | 0", content);
	}
}
