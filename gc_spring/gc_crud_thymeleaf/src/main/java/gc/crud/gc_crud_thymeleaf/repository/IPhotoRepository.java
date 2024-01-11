package gc.crud.gc_crud_thymeleaf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gc.crud.gc_crud_thymeleaf.model.Photo;

@Repository
public interface IPhotoRepository extends CrudRepository<Photo, Integer> {

}