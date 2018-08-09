package com.matthieurb.jokesgenerator.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesGeneratorServiceImpl implements JokesGeneratorService {
	
	private ChuckNorrisQuotes chuck;

	public JokesGeneratorServiceImpl() {
		this.chuck = new ChuckNorrisQuotes();
	}

	@Override
	public String getAJoke() {
		return chuck.getRandomQuote();
	}
	
}
