package com.mygdx.game.other;

public class Move {
	int targetDammage;
	int playerDammage;
	double targetAttack;
	String name;
	

	public Move(int targetDammage, int playerDammage, double targetAttack, String name) {
		this.targetDammage = targetDammage;
		this.playerDammage = playerDammage;
		this.targetAttack = targetAttack;
		this.name = name;
	}


	public int getTargetDammage() {
		return targetDammage;
	}


	public int getPlayerDammage() {
		return playerDammage;
	}


	public double getTargetAttack() {
		return targetAttack;
	}
	
	public String getName() {
		return name;
	}
}
