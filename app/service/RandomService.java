package service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.inject.Singleton;

import models.AnObject;

/**
 * Created by esfandiaramirrahimi on 2015-05-14.
 */
@Singleton
public class RandomService implements IRandomService {
	List<AnObject> objects = new ArrayList<>();

	@Override
	public void addAnObject(AnObject anObject) {
		anObject.setId(UUID.randomUUID().toString());
		objects.add(anObject);
	}

	@Override
	public List<AnObject> getAllObjects() {
		return objects;
	}

}
