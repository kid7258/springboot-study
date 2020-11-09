package study.hellospring.repository;

import study.hellospring.domain.Hero;

import java.util.List;
import java.util.Optional;

public interface HeroRepository {
    Hero save(Hero hero);
    Optional<Hero> findById(int id);
    Optional<Hero> findByName(String name);
    List<Hero> findAll();
    Optional<Hero> deleteById(int id);
}
