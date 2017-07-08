package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Game;

public interface GameRepository extends CrudRepository<Game,Integer>{
	 Game findByName(String name);

}
