package guru.springframework.jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.jokesapp.services.JokeService;

@Controller
public class JokesController {
	private final JokeService jokeService;
	
	public JokesController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/", " "})
	public String showJoke(Model model) {
		
		model.addAttribute("joke", jokeService.getJoke());  // attribute joke lets us reference it from the view (html file)
		return "index";
	
	}
	
}
