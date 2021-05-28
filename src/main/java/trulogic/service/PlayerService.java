package trulogic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trulogic.entity.Player;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class PlayerService {

	@Autowired
	private PlayerSupplier playerSupplier;

	public List<String> doActionAccordingToPlayerType(List<Player> players) {

		return players.stream().map( p -> {
			PlayerType playerType = playerSupplier.supplyPlayer(p.getType().toUpperCase(Locale.ROOT));
			return playerType.getMassageFromActionPerformed(p);
		}).collect(Collectors.toList());

	}
}
