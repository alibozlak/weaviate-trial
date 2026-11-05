package dev.bozlak.weaviate_trial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.weaviate.client6.v1.api.WeaviateClient;

@SpringBootApplication
public class WeaviateTrialApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WeaviateTrialApplication.class, args);

		//Check Weaviate connection
		WeaviateClient weaviateClient = WeaviateClient.connectToLocal();
		System.out.println("---> Weaviate connection successful: " + weaviateClient.isReady());
		weaviateClient.close();
	}

}
