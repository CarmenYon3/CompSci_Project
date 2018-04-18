package com.mygdx.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.sprites.Enemy;
import com.mygdx.game.sprites.PlayerCharacterFight;

public class FightingState extends State {

	private PlayerCharacterFight fighter;
	private Enemy enemy;
	
	public FightingState(GameStateManager gsm,Enemy enemy) {
		super(gsm);
		fighter = new PlayerCharacterFight();
		this.enemy = enemy;
	}
	
	@Override
	protected void handleInput() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(float dt) {
		// TODO Auto-generated method stub
		fighter.update(dt);
		enemy.update(dt);
	}

	@Override
	public void render(SpriteBatch sb) {
		// TODO Auto-generated method stub
			sb.begin();
			sb.draw(fighter.getTexture(), 0, 0,250,250);
			sb.draw(enemy.getTexture(),300,150,250,250);
			sb.end();
	}

}
