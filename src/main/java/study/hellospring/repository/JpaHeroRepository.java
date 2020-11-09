package study.hellospring.repository;

import study.hellospring.domain.Hero;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaHeroRepository implements HeroRepository {

    private final EntityManager em;
    public JpaHeroRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Hero save(Hero hero) {
        return null;
    }

    @Override
    public Optional<Hero> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Hero> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Hero> findAll() {
        return null;
    }

    @Override
    public Optional<Hero> deleteById(int id) {
        return null;
    }
}
