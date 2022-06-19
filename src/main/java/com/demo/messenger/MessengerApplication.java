package com.demo.messenger;

import com.demo.messenger.model.Message;
import com.demo.messenger.service.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MessengerApplication implements CommandLineRunner {

	@Autowired
	private MessageRepository messageRepository;

	public static void main(String[] args) {
		SpringApplication.run(MessengerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		messageRepository.deleteAll();

		messageRepository.save(new Message("tauqs","megha", "Hello Megha"));

		System.out.println("Messages found with findAll():");
		System.out.println("..............................");

		for (Message message: messageRepository.findAll())
		{
			System.out.println(message);
		}

		System.out.println();

		// fetch an individual customer
		System.out.println("Message found with findBySender('tauqs'):");
		System.out.println("--------------------------------");
		System.out.println(messageRepository.findBySender("tauqs"));
	}
}
