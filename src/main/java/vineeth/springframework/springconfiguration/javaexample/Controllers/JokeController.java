package vineeth.springframework.springconfiguration.javaexample.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vineeth.springframework.springconfiguration.javaexample.Services.JokeService;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService)
    {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJokes(Model model)
    {
        model.addAttribute("jokes",jokeService.getJoke());
        return "chucknorris";
    }

}
