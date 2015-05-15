package service;

import java.util.List;

import models.AnObject;

/**
 * Created by esfandiaramirrahimi on 2015-05-14.
 */
public interface IRandomService {
	public void addAnObject(AnObject anObject);

	public List<AnObject> getAllObjects();
}
