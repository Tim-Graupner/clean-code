package briscoe.cleancode;

import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleFormatterTest {

	@Test
	public void toHtml() {
		final String expected = String.format(VehicleFormatter.HTML_TEMPLATE, "1HGBH41JXMN109186", true, "Honda", "civic", "2016", "BLUE", 0);
		final String content = VehicleFormatter.byVin("1HGBH41JXMN109186").toHtml();
		assertEquals(expected, content);
	}

	@Test
	public void toMarkdown() {
		final String expected = String.format(VehicleFormatter.MARKDOWN_TEMPLATE, "1HGBH41JXMN109186", true, "Honda", "civic", "2016", "BLUE", 0);
		final String content = VehicleFormatter.byVin("1HGBH41JXMN109186").toMarkdown();
		assertEquals(expected, content);
	}
}
