package guru.springframework.norris.chuck.chucknorrisjokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
    public String getJoke(){
        ChuckNorrisQuotes quote = new ChuckNorrisQuotes();
        return quote.getRandomQuote();
    }
}
