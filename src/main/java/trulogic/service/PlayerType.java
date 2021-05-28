package trulogic.service;

import org.springframework.stereotype.Service;
import trulogic.entity.Player;

@Service
public interface PlayerType {
    String getMassageFromActionPerformed(Player player);
}
