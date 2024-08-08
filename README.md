# quarkus-ai-llm-summarizer

This project uses Quarkus to create a summarizer REST service for test and files. It uses Ollama (llama3.1) LLM in order to do the task.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Testing the service

Once the application is running then you can send rest calls like these ones:

```shell script
http POST http://localhost:8080/summarize/text text="Esto es un test" language="english"
```

Previous to the next one, just create a file ("file.txt") and put some text on it to translate.

```shell script
http -f POST http://localhost:8080/summarize/file input@file.txt
```

## Related Guides

- LangChain4j Ollama ([guide](https://docs.quarkiverse.io/quarkus-langchain4j/dev/index.html)): Provides the basic integration of Ollama with LangChain4j

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
# quarkus-ai-llm-translator
