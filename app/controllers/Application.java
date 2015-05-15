package controllers;

import javax.inject.Inject;
import javax.inject.Singleton;

import models.AnObject;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import service.IRandomService;
import views.html.index;

/**
 * Created by esfandiaramirrahimi on 2015-05-14.
 */
@Singleton
public class Application extends Controller {
	private IRandomService iRandomService;

	@Inject
	public Application(final IRandomService iRandomService) {
		this.iRandomService = iRandomService;
	}

	public Result index() {
		return ok(index.render(Form.form(AnObject.class)));
	}

	public Result addAnObject() {
		Form<AnObject> form = Form.form(AnObject.class).bindFromRequest();
		AnObject anObject = form.get();
		iRandomService.addAnObject(anObject);
		return redirect(controllers.routes.Application.index());
	}

	public Result listObjects() {
		return ok(Json.toJson(iRandomService.getAllObjects()));
	}

}
