package briscoe.cleancode;

import org.junit.Test;

public class VehicleFormatterTest {

	@Test
	public void toHtml() {
		final String content = VehicleFormatter.byVin("1HGBH41JXMN109186").toHtml();
		System.out.println(content);
	}
	
	@Test
	public void toMarkdown() {
		final String content = VehicleFormatter.byVin("1HGBH41JXMN109186").toMarkdown();
		System.out.println(content);
	}
}
