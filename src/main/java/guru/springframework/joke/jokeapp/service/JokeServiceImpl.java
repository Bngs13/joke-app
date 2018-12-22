package guru.springframework.joke.jokeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    //20181222
    public JokeServiceImpl() {
      this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

   // public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
    //    this.chuckNorrisQuotes = chuckNorrisQuotes;
   // }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
