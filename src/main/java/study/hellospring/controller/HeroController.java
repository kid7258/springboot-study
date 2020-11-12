package study.hellospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import study.hellospring.domain.Hero;
import study.hellospring.service.HeroService;

import java.util.List;

@RestController
public class HeroController {
    private final HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping(value = "/api/heroes")
    public List<Hero> list() {
        return heroService.findMembers();
    }

    @GetMapping(value = "/api/heroes/{id}")
    public Hero findOne(@PathVariable int id) {
        return heroService.findById(id);
    }

    @PostMapping(value = "/api/heroes")
    public Hero create(@RequestBody Hero hero) { // < 파라미터 확인 필요
        return heroService.join(hero);
    }

    @PutMapping(value = "/api/heroes")
    public Hero update(@RequestBody Hero hero) {
        return heroService.update(hero);
    }

    @DeleteMapping(value = "/api/heroes/{id}")
    // 여기에 뭔가 응답을 주고 싶음, 삭제된 hero의 id 또는 name
    public void delete(@PathVariable int id) {
        heroService.remove(id);
    }
}
