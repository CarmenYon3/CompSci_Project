package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class PlayerCharacterMove {
	public static final int MOVEMENT = 50;
	
	private Vector2 position;
	private Vector2 velocity;
	private Texture defaultTexture;
	
	public PlayerCharacterMove(int x, int y) {
		position = new Vector2(x,y);
		velocity = new Vector2(0,0);
		defaultTexture = new Texture("testCharacter.png");		
	}
	
	public void update(float dt) {
		velocity.scl(dt);
		position.add(velocity.x,velocity.y);
		velocity.scl(1/dt);
	}
	
	public void moveRight() {
		velocity.x = MOVEMENT;
	}
	
	public void moveLeft() {
		velocity.x = -MOVEMENT;
	}
	
	public void moveDown() {
		velocity.y = -MOVEMENT;
	}
	
	public void moveUp() {
		velocity.y = MOVEMENT;
	}
	
	public Texture getTexture() {
		return defaultTexture;
	}
}
