package gc.crud.gc_crud_thymeleaf.service;

import java.util.Optional;

import gc.crud.gc_crud_thymeleaf.model.Photo;

// https://www.youtube.com/watch?v=5bnYxunqmPo
// https://www.youtube.com/watch?v=vrwitaK2KQk

public interface IPhotoService {

	public Iterable<Photo> getAll();
	
	public Optional<Photo> getById(int id);
	
	public Photo create(Photo photo);
	
	public Optional<Photo> update(int id, Photo photo);
	
	public Boolean delete(int id);
}