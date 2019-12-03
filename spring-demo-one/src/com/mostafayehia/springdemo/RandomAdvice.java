package com.mostafayehia.springdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomAdvice implements AdviceService {

	ArrayList<String> advices = new ArrayList<String>(Arrays.asList("Sleep early"
	,"Fear Allah",
	"exercise often"));
	
	
	@Override
	public String giveAdvice() {
		return advices.get(new Random().nextInt(3));
	}

}
