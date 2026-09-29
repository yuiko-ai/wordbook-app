package j.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import j.entity.Word;

public interface WordRepository extends JpaRepository<Word, Long> {

}
