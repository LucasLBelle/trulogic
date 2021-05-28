package trulogic.messaging;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import trulogic.entity.Player;

@Service
public class Producer {

    private static final String TOPIC = "novice-players";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(Player p) {
        Gson g = new Gson();
        this.kafkaTemplate.send(TOPIC, g.toJson(p));
    }
}
