package study.hellospring.repository;

import study.hellospring.domain.Hero;

import java.util.List;
import java.util.Optional;

public interface HeroRepository {
    Hero save(Hero hero);
    Hero findById(int id);
    Hero findByName(String name);
    List<Hero> findAll();
    Hero deleteById(int id);
}
