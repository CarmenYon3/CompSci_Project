package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.sprites.PlayerCharacterMove;

public class WalkState extends State{
	private PlayerCharacterMove walker;
	
	public WalkState(GameStateManager gsm) {
		super(gsm);
		walker = new PlayerCharacterMove(100,100);
	}
	
	protected void handleInput() {
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			walker.moveRight();
		}
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			walker.moveRight();
		}
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			walker.moveRight();
		}
	}

	
	public void update(float dt) {
		// TODO Auto-generated method stub
		
	}

	
	public void render(SpriteBatch sb) {
		// TODO Auto-generated method stub
		
	}
	
}
