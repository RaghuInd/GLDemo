package com.app.exceptions.custom;

public class VotingSystemService {
	
	public void vote(int age) throws VotingException, VotingTimerException {
		int timer=10;
		if(age<18)
			throw new VotingException("age <18 y");
		if(timer>10)
			throw new VotingTimerException("Your voting time expired.");
		
		
	}

}
