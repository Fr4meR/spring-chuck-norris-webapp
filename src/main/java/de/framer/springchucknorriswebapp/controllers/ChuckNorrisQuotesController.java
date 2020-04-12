package de.framer.springchucknorriswebapp.controllers;

import de.framer.springchucknorriswebapp.services.ChuckNorrisQuotesService;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.model.IModel;

/**
 * {@link Controller} for the chuck norris quotes app
 */
@Controller
public class ChuckNorrisQuotesController {

    private final ChuckNorrisQuotesService quotesService;

    /**
     * Constructor
     * @param quotesService
     *      The {@link ChuckNorrisQuotesService} to use for getting quotes.
     */
    public ChuckNorrisQuotesController(ChuckNorrisQuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @RequestMapping("/")
    public String showRandomQuote(Model model) {
        model.addAttribute("joke", quotesService.getRandomQuote());
        return "chucknorris";
    }
}
