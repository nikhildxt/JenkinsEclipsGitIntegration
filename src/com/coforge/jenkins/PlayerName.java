package com.coforge.jenkins;

public class PlayerName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player p = new Player(10, "sachin", "maharastra");
		
		System.out.println(p.getPlayerNo() + ": "+ p.getPlayerName()+ ": "+ p.getState());

	}

}
