import dagger.ObjectGraph;
import models.AnObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.IRandomService;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by esfandiaramirrahimi on 2015-05-14.
 */
public class RandomServiceTest {
    @Inject
    IRandomService IRandomService;

    @Before
    public void setUp() {
        ObjectGraph.create(new DaggerTestConfig()).
                inject(this);
    }


    @Test
    public void testAddingAnObject() {
        AnObject anObject = new AnObject();
        anObject.setId("testId");
        anObject.setName("test name");
        IRandomService.addAnObject(anObject);

        List<AnObject> anObjects = IRandomService.getAllObjects();

        Assert.assertEquals(anObjects.size(), 1);
    }
}
