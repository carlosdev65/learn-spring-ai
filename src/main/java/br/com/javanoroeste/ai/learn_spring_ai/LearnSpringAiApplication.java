package br.com.javanoroeste.ai.learn_spring_ai;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.image.ImageModel;
import org.springframework.ai.openai.OpenAiImageModel;
import org.springframework.ai.openai.api.OpenAiApi;
import org.springframework.ai.openai.api.OpenAiImageApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearnSpringAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringAiApplication.class, args);
	}

	@Bean
	ImageModel imageModel(@Value("${OPENAI_API_KEY}") String apiKey) {
		return new OpenAiImageModel(new OpenAiImageApi(apiKey));
	}

	@Bean
	ChatModel chatModel(@Value("${OPENAI_API_KEY}") String apiKey) {
		return new OpenAiChatModel(new OpenAiApi(apiKey));
	}

}
