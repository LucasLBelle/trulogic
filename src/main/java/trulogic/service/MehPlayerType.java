package trulogic.service;

import org.springframework.stereotype.Service;
import trulogic.entity.Player;

@Service
public class MehPlayerType implements PlayerType {

    @Override
    public String getMassageFromActionPerformed(Player player) {
        return "player " + player.getName() + " did not fit";
    }
}
