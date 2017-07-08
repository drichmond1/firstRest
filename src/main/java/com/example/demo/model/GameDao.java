package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.repository.GameRepository;



@Component
public class GameDao {
	@Autowired
	private Game game;
	@Autowired
	GameRepository repo;
	
public void putGame(Game game){
	repo.save(game);
	
}
public List<Game> getGames(){
	List<Game> games=new ArrayList();
	Iterable<Game> itr=repo.findAll();
	itr.forEach(x->games.add(x));
	return games;
}
}
