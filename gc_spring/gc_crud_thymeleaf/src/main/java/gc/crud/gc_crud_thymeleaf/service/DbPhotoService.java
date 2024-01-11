package gc.crud.gc_crud_thymeleaf.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gc.crud.gc_crud_thymeleaf.model.Photo;
import gc.crud.gc_crud_thymeleaf.repository.IPhotoRepository;

@Service("mainPhotoService")
// @Service
public class DbPhotoService implements IPhotoService {

    @Autowired
    private IPhotoRepository photoRepository;

    @Override
    public Iterable<Photo> getAll() {

        return photoRepository.findAll();
        // return new ArrayList<Photo>();
    }

    @Override
    public Optional<Photo> getById(int id) {

        return photoRepository.findById(id);
        // return Optional.empty();
    }

    @Override
    public Photo create(Photo photo) {

        return photoRepository.save(photo);
        // return null;
    }

    @Override
    public Optional<Photo> update(int id, Photo photo) {

        Optional<Photo> foundPhoto = photoRepository.findById(id);

        if (foundPhoto.isEmpty()) {

            return Optional.empty();
        }

        foundPhoto.get().setUrl(photo.getUrl());

        photoRepository.save(foundPhoto.get());

        return foundPhoto;

        // return Optional.empty();
    }

    @Override
    public Boolean delete(int id) {

        Optional<Photo> foundPhoto = photoRepository.findById(id);

        if (foundPhoto.isEmpty()) {

            return false;
        }

        photoRepository.delete(foundPhoto.get());

        return true;

    }
}