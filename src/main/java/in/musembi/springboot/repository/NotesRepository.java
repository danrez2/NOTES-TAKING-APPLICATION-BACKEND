package in.musembi.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.musembi.springboot.entity.Note;
@Repository
public interface NotesRepository extends JpaRepository<Note, Long> {

}
