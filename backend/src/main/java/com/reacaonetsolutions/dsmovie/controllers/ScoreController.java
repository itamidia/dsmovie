package com.reacaonetsolutions.dsmovie.controllers;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reacaonetsolutions.dsmovie.dto.MovieDTO;
import com.reacaonetsolutions.dsmovie.dto.ScoreDTO;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){
		
		return null;
		
	} 
}
