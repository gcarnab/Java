package gc.crud.gc_crud_thymeleaf.controller.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import gc.crud.gc_crud_thymeleaf.model.Photo;
import gc.crud.gc_crud_thymeleaf.service.IPhotoService;


//https://www.youtube.com/watch?v=SstsvlRvTpk

@RestController
public class PhotoController {

    @Autowired //dependency injection
    @Qualifier("mainPhotoService")//dependency injection
    private IPhotoService photoService;

    public PhotoController() {

    }

    @RequestMapping("/api/photos")
    public Iterable<Photo> getAll() {
        return photoService.getAll();
    }

    @RequestMapping("/api/photos/{id}")
    public Photo getById(@PathVariable int id) {

        Optional<Photo> photo = photoService.getById(id);

        if (photo.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
        }
        return photo.get();
    }

}