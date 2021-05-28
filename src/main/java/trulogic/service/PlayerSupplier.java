package trulogic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PlayerSupplier {

    @Autowired
    private NovicePlayerType novicePlayerType;
    @Autowired
    private ExpertPlayerType expertPlayerType;
    @Autowired
    private MehPlayerType mehPlayerType;

    public PlayerType supplyPlayer(String playerType) {
        return getMappedPlayersType().get(playerType);
    }

    private Map<String, PlayerType> getMappedPlayersType(){
        Map<String, PlayerType> players = new HashMap<>();

        players.put("EXPERT", expertPlayerType);
        players.put("NOVICE", novicePlayerType);
        players.put("MEH", mehPlayerType);

        return players;
    }
}