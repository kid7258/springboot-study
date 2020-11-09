package study.hellospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import study.hellospring.domain.Hero;
import study.hellospring.service.HeroService;

import java.util.List;
import java.util.Optional;

@Controller
public class HeroController {
    private final HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @RequestMapping(value = "/api/heroes", method = RequestMethod.POST)
    @ResponseBody
    public Hero create(@RequestBody Hero hero) { // < 파라미터 확인 필요
        Hero addHero = new Hero();
        addHero.setName(hero.getName());
        Hero result = heroService.join(addHero);

        return result;
    }

    @RequestMapping(value = "/api/heroes", method = RequestMethod.GET)
    @ResponseBody
    public List<Hero> list() {
        List<Hero> heroes = heroService.findMembers();
        return heroes;
    }

    @RequestMapping(value = "/api/heroes/{id}", method = RequestMethod.DELETE)
    // 여기에 뭔가 응답을 주고 싶음, 삭제된 hero의 id 또는 name
    public int delete(@PathVariable int id) {
        Optional<Hero> hero = heroService.findById(id);
        heroService.remove(id);

        return id;
    }
}
