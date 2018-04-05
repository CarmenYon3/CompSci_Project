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
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) 
			walker.moveRight(true);
		else
			walker.moveRight(false);
		
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) 
			walker.moveLeft(true);
		else
			walker.moveLeft(false);
		
		if(Gdx.input.isKeyPressed(Input.Keys.UP)) 
			walker.moveUp(true);
		else
			walker.moveUp(false);
		
		if(Gdx.input.isKeyPressed(Input.Keys.DOWN)) 
			walker.moveDown(true);
		else
			walker.moveDown(false);
	}

	
	public void update(float dt) {
		// TODO Auto-generated method stub
		handleInput();
		walker.update(dt);
	}

	
	public void render(SpriteBatch sb) {
		// TODO Auto-generated method stub
		sb.begin();
		sb.draw(walker.getTexture(), walker.getPosition().x, walker.getPosition().y);
		sb.end();
	}
	
}
