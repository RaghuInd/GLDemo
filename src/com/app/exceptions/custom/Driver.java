package com.app.exceptions.custom;

public class Driver {

	public static void main(String[] args) {

		int age = 17;
//		try {
//		if(age<18) {
//			throw new VotingException("Voter age is below 18 Yrs.");
//		}}
//		catch (VotingException e) {
//			System.out.println(e.getMessage());
//		}
		VotingSystem votingSystem = new VotingSystem();

		age = 18;
		try {
			votingSystem.vote(age);
		} 
		catch (VotingTimerException e) {
			System.out.println(e.getMessage());
		} catch (VotingException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("General exception handling block executed."+e.getMessage());
		}

//		 catch (VotingException | VotingTimerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		System.out.println("Thank you for voting !");
	}

}
