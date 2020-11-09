package study.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.hellospring.repository.HeroRepository;
import study.hellospring.service.HeroService;

@Configuration
public class SpringConfig {
    private final HeroRepository heroRepository;

    @Autowired
    public SpringConfig(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @Bean
    public HeroService heroService() {
        return new HeroService(heroRepository);
    }
}
