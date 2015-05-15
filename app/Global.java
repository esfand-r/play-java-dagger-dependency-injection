import dagger.ObjectGraph;
import play.Application;
import play.GlobalSettings;

/**
 * Created by esfandiaramirrahimi on 2015-05-14.
 */
public class Global extends GlobalSettings {
	private ObjectGraph objectGraph;

	@Override
	public void beforeStart(Application app) {
		super.beforeStart(app);
		objectGraph = ObjectGraph.create(new DaggerConfig());
	}

	@Override
	public <A> A getControllerInstance(Class<A> controllerClass) throws Exception {
		return objectGraph.get(controllerClass);
	}
}
