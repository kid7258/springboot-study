package study.hellospring.service;

import org.springframework.transaction.annotation.Transactional;
import study.hellospring.domain.Hero;
import study.hellospring.repository.HeroRepository;

import java.util.List;
import java.util.Optional;

public class HeroService {
    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public Hero join(Hero hero) {
        heroRepository.save(hero);

        return hero;
    }

    public List<Hero> findMembers() {
        return heroRepository.findAll();
    }

    public Hero findById(int id) {
        return heroRepository.findById(id);
    }

    public void remove(int id) {
        heroRepository.deleteById(id);
    }
}
