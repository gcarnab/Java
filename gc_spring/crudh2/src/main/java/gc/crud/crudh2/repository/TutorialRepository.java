package gc.crud.crudh2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import gc.crud.crudh2.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    /*
     * Now we can use JpaRepository’s methods:
     * save(), findOne(), findById(), findAll(), count(), delete(), deleteById()…
     * without implementing these methods.
     * The implementation is plugged in by Spring Data JPA automatically.
     */

    // returns all Tutorials with published having value as input published.
    List<Tutorial> findByPublished(boolean published);

    // returns all Tutorials which title contains input title.
    List<Tutorial> findByTitleContaining(String title);
}