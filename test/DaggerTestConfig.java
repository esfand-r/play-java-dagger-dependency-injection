import dagger.Module;
import dagger.Provides;
import service.IRandomService;
import service.RandomService;

/**
 * Created by esfandiaramirrahimi on 2015-05-14.
 */
@Module(
	injects = {
		RandomServiceTest.class
	}
)
public class DaggerTestConfig {
	@Provides
	IRandomService provideRandomService() {
		return new RandomService();
	}
}
