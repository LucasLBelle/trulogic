package trulogic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trulogic.entity.Player;
import trulogic.messaging.Producer;

@Service
public class NovicePlayerType implements PlayerType {

    @Autowired
    private Producer kafkaProducer;

    @Override
    public String getMassageFromActionPerformed(Player player) {
        try {
            kafkaProducer.sendMessage(player);
            return "player " + player.getName() + " sent to Kafka topic";
        } catch(Exception e){
            return "player " + player.getName() + " found error to be sent to Kafka topic";
        }
    }
}
