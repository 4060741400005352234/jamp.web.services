package jamp.dao;

import java.util.List;

public interface AbstractDao<T> {
	
	long save(T object);
	T get(long id);
	List<T> getAll();
	void update(T object);
	void remove(T object);
}
