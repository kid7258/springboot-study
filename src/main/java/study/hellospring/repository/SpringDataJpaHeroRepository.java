package study.hellospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.hellospring.domain.Hero;

import java.util.Optional;

public interface SpringDataJpaHeroRepository extends JpaRepository<Hero, Integer>, HeroRepository {
    @Override
    Hero findByName(String name);
}
