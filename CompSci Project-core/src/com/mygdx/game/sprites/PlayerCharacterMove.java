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
	
	public Vector2 getPosition() {
		return position;
	}
	
	public void moveRight(boolean isPressed) {
		if(isPressed)
			velocity.x = MOVEMENT;
		else
			velocity.x = 0;
	}
	
	public void moveLeft(boolean isPressed) {
		if(isPressed)
			velocity.x = -MOVEMENT;
		else
			velocity.x = 0;
	}
	
	public void moveDown(boolean isPressed) {
		if(isPressed)
			velocity.y = -MOVEMENT;
		else
			velocity.y = 0;	
		}
	
	public void moveUp(boolean isPressed) {
		if(isPressed)
			velocity.y = MOVEMENT;
		else
			velocity.y = 0;	
	}
	
	public Texture getTexture() {
		return defaultTexture;
	}
	
}
