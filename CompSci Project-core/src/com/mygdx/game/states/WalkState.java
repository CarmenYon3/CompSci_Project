package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Timer;
import com.mygdx.game.sprites.NonPlayerCharacter;
import com.mygdx.game.sprites.PlayerCharacterMove;

public class WalkState extends State{
	private PlayerCharacterMove walker;
	private NonPlayerCharacter npcBasic;
	private Timer time;
	
	public WalkState(GameStateManager gsm) {
		super(gsm);
		walker = new PlayerCharacterMove(100,100,200);
		npcBasic = new NonPlayerCharacter(200,200);
		npcBasic.setAnimation(0);
		time = new Timer();
	}
	
	protected void handleInput() {
		Vector2 vel = walker.getVelocity();
		int mov = walker.getMovement();
		vel.set(new Vector2(0,0));
		
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT) && walker.getPosition().x + walker.getTexture().getRegionWidth() < Gdx.graphics.getWidth()) { 
			vel.add(mov,0);
			walker.setAnimation(1);
		}
		
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)  && walker.getPosition().x > 0) {
			vel.add(-mov,0);
			walker.setAnimation(1);
		}
		if(Gdx.input.isKeyPressed(Input.Keys.UP)  && walker.getPosition().y + walker.getTexture().getRegionHeight() < Gdx.graphics.getHeight()) { 
			vel.add(0,mov);
			walker.setAnimation(1);
		}
		
		if(Gdx.input.isKeyPressed(Input.Keys.DOWN)  && walker.getPosition().y  > 0) { 
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
		
		if(npcBasic.collides(walker.getBounds()) && Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
			gsm.push(new DialogueState(gsm));
			time.delay(1000);
		}
		
		
		walker.update(dt);
		npcBasic.update(dt);
	}

	
	public void render(SpriteBatch sb) {
		// TODO Auto-generated method stub
		sb.begin();
		sb.draw(walker.getTexture(), walker.getPosition().x, walker.getPosition().y);
		sb.draw(npcBasic.getTexture(), npcBasic.getPosition().x, npcBasic.getPosition().y );
		sb.end();
	}

	
}
