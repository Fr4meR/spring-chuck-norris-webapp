package de.framer.springchucknorriswebapp.services;

import org.springframework.stereotype.Service;

/**
 * Provides Chuck Norris quotes.
 */
public interface ChuckNorrisQuotesService {

    /**
     * @return
     *      A random chuck norris quote.
     */
    String getRandomQuote();
}
