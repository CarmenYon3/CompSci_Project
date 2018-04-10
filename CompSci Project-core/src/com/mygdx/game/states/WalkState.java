package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.sprites.PlayerCharacterMove;

public class WalkState extends State{
	private PlayerCharacterMove walker;
	
	public WalkState(GameStateManager gsm) {
		super(gsm);
		walker = new PlayerCharacterMove(100,100,200);
	}
	
	protected void handleInput() {
		Vector2 vel = walker.getVelocity();
		int mov = walker.getMovement();
		vel.set(new Vector2(0,0));
		
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) { 
			vel.add(mov,0);
			walker.setAnimation(1);
		}
		
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			vel.add(-mov,0);
			walker.setAnimation(1);
		}
		if(Gdx.input.isKeyPressed(Input.Keys.UP)) { 
			vel.add(0,mov);
			walker.setAnimation(1);
		}
		
		if(Gdx.input.isKeyPressed(Input.Keys.DOWN)) { 
			vel.add(0,-mov);
			walker.setAnimation(1);
		}
		
		
		if(vel.equals(new Vector2(0,0))) {
			walker.setAnimation(0);
		}
			
	}

	
	public void update(float dt) {
		// TODO Auto-generated method stub
		handleInput();
		
		walker.update(dt);
	}

	
	public void render(SpriteBatch sb) {
		// TODO Auto-generated method stub
		sb.begin();
		sb.draw(walker.getTexture(), walker.getPosition().x, walker.getPosition().y,100,100);
		sb.end();
	}

	
}
