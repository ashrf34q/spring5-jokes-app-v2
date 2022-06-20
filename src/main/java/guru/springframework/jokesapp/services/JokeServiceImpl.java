package guru.springframework.jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokeServiceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes(); // because in the ChuckNorrisQuotes class, data 
														  // is already preloaded in the object
	}
	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote() ;
	}

}
