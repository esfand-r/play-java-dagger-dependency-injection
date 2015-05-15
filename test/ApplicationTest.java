import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.running;

import models.AnObject;
import org.junit.Test;

import play.data.Form;
import play.twirl.api.Html;

/**
 * Created by esfandiaramirrahimi on 2015-05-14.
 */
public class ApplicationTest {
	@Test
	public void indexTemplate() {
		running(fakeApplication(), new Runnable() {
			public void run() {
				Form<AnObject> form = Form.form(AnObject.class);
				Html html = views.html.index.render(form);
				assertThat(contentType(html)).isEqualTo("text/html");
				assertThat(contentAsString(html)).contains("Sample App");
			}
		});
	}
}
