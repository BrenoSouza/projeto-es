package br.edu.ufcg.es.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufcg.es.model.Game;
import br.edu.ufcg.es.service.GameService;

@RestController
@CrossOrigin
public class RegisterGameController {
	private GameService gameService;
	
	@Autowired
	public RegisterGameController(GameService gameService){
		this.gameService = gameService;
	}
	
/*    @RequestMapping(value = "/registerGame", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> registerGame(@Valid @RequestBody RegisterGame registerGame){
        Game game = new Game(registerGame.getDate(),
                                registerGame.getLocal(),
                                registerGame.getSport(),
                                registerGame.getDescription());

        gameService.create(game);
        return new ResponseEntity<>("Partida criada com sucesso.", HttpStatus.CREATED);
    }*/

}
