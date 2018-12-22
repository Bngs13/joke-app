package guru.springframework.joke.jokeapp.controller;

import guru.springframework.joke.jokeapp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokeService jokeService;

    @Autowired //20181216, it is not necessary for constructor DI
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
@RequestMapping({"/",""})
    public String ShowJoke(Model model){

        model.addAttribute("joke",jokeService.getJoke());

        return "chucknorris"; //20181216, it is view name
    }
}
