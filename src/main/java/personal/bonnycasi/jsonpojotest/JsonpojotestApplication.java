package personal.bonnycasi.jsonpojotest;

import java.io.FileInputStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;

import personal.bonnycasi.jsonpojotest.dto.User;

@SpringBootApplication
public class JsonpojotestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JsonpojotestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		FileInputStream fis = new FileInputStream("src/main/resources/testout.json");

		byte[] data = fis.readAllBytes();

		fis.close();

		ObjectMapper mapper = new ObjectMapper();

		User user = mapper.readValue(new String(data), User.class);

		System.out.println("User is: " + user);
	}
}
