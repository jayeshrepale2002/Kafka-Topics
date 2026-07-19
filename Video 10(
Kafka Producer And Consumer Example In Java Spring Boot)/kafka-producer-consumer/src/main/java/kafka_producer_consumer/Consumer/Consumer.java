package kafka_producer_consumer.Consumer;

import org.springframework.kafka.annotation.KafkaListeners;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListeners(topics = {"fruits"}, groupId = "abc")
	public void consumeMessage(String message) {
		System.out.println(message);
	}
}
