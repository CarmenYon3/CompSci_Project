package com.mygdx.game; 

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.sprites.CrushFight;
import com.mygdx.game.states.FightingState;
import com.mygdx.game.states.GameStateManager;
import com.mygdx.game.states.WalkState;

public class CompSciGame extends ApplicationAdapter {
	public static final int WIDTH = 600;
	public static final int HEIGHT = 400;
	public static final String TITLE = "Computer Science Game";
	private GameStateManager gameStateManager;
	
	SpriteBatch batch;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		gameStateManager = new GameStateManager();
		gameStateManager.push(new WalkState(gameStateManager));

		gameStateManager.push(new FightingState(gameStateManager,new CrushFight(10,10)));
		Gdx.gl.glClearColor(1, 0, 0, 1);
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gameStateManager.update(Gdx.graphics.getDeltaTime());
		gameStateManager.render(batch);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
