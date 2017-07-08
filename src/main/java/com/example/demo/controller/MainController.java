package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Game;
import com.example.demo.model.GameDao;

@RestController
public class MainController {
	@Autowired
	Game game;
	@Autowired
	GameDao dao;
    
	@RequestMapping(value="/games", method = RequestMethod.GET)
	public List<Game> getGames(){
		
		return dao.getGames();
		
	}
	@RequestMapping(value="/addgame", method = RequestMethod.POST)
	public void addGame(@RequestBody Game game){
		
		this.game=game;
		dao.putGame(game);
		System.out.println(game.getStars());
		
		
	}
	
}
