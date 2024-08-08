package me.amiralles.summarizer;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/summarize")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class TextSummarizerResource {

    @Inject
    SummarizerAiService summarizerAiService;

    @Path("/text")
    @POST
    public String translate(TextTranslationRequest textInput) {
        return summarizerAiService.summarize(textInput.text(), textInput.language());
    }

    public static record TextTranslationRequest(String text, String language) {
    }

}
