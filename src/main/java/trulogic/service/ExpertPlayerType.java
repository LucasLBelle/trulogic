package trulogic.service;

import trulogic.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import trulogic.entity.Player;

@Service
@Transactional
public class ExpertPlayerType implements PlayerType {

    @Autowired
    private PlayerRepository h2Repository;

    @Override
    public String getMassageFromActionPerformed(Player player) {
        try {
            h2Repository.save(player);
            return "player " + player.getName() + " stored in DB";
        } catch(Exception e){
            return "player" + player.getName() + " found errors to be stored in DB";
        }
    }
}
