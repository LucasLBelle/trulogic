package trulogic.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trulogic.service.PlayerService;
import trulogic.to.PlayersTO;
import trulogic.to.ResultTO;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/*")
@Api( value = "Process player according to its type", tags = "Player List")
public class PlayersController {

	@Autowired
	private PlayerService playerService;

	@PostMapping(value = "players", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<ResultTO> processPlayers(@Valid @RequestBody PlayersTO playersTO)
			throws JsonProcessingException {

		ResultTO resultTO = new ResultTO();

		try{
			resultTO.setResult(playerService.doActionAccordingToPlayerType(playersTO.getPlayers()));
			return ResponseEntity.ok().body(resultTO);
		} catch (Exception e) {
			List<String> error = new ArrayList<>();
			error.add("Processing error...");
			resultTO.setResult(error);
			return ResponseEntity.badRequest().body(resultTO);
		}
	}
}
