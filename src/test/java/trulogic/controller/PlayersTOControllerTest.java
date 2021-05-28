package trulogic.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import trulogic.entity.Player;
import trulogic.repository.PlayerRepository;
import trulogic.service.PlayerService;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class PlayersTOControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Autowired
	private PlayerService playerService;

	@Autowired
	private PlayerRepository h2Repository;

	private List<Player> players;
	private List<String> result;


	@BeforeEach
	void init() {
		h2Repository.deleteAll();

		players = new ArrayList<>();

		Player player1 = new Player();
		player1.setName("Sub_zero");
		player1.setType("expert");

		Player player2 = new Player();
		player2.setName("Scorpion");
		player2.setType("novice");

		players.add(player1);
		players.add(player2);

	}

	@Test
	void processWithSuccess() {


	}

	@Test
	void processWithFailure() {

	}
}
