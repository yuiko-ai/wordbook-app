package j.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import j.entity.Section;

public interface SectionRepository extends JpaRepository<Section, Long> {

}