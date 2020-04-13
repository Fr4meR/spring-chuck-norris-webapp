package de.framer.springchucknorriswebapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Implementation of the {@link ChuckNorrisQuotesService}
 */
@Service
public class ChuckNorrisQuotesServiceImpl implements ChuckNorrisQuotesService {

    private final ChuckNorrisQuotes quotes;

    /**
     * Constructor
     * @param quotes
     *      A {@link ChuckNorrisQuotes} object that provides the quotes.
     */
    public ChuckNorrisQuotesServiceImpl(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    @Override
    public String getRandomQuote() {
        return quotes.getRandomQuote();
    }
}
