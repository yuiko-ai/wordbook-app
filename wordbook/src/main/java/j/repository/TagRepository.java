package j.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import j.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {

}
