package me.amiralles.summarizer;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService(chatMemoryProviderSupplier = // disable chat memory
RegisterAiService.NoChatMemoryProviderSupplier.class)
public interface SummarizerAiService {

    @SystemMessage("You are a professional summarizer.")
    @UserMessage("""
                Summarize the text delimited by '---' into {language}.
                Do not include the delimiter in the summary.
                ---
                {text}
            """)
    String summarize(String text, String language);
}
