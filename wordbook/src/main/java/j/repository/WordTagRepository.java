package j.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import j.entity.WordTag;

public interface WordTagRepository extends JpaRepository<WordTag, Long> {

}
