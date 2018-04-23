package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.other.Move;
import com.mygdx.game.sprites.Enemy;
import com.mygdx.game.sprites.PlayerCharacterFight;

public class FightingState extends State {

	private PlayerCharacterFight fighter;
	private Enemy enemy;
	public int movesIndex;
	boolean yourTurn;
	int[] colors;
	private BitmapFont font;
	
	public FightingState(GameStateManager gsm, Enemy enemy) {
		super(gsm);
		fighter = new PlayerCharacterFight();
		this.enemy = enemy;
		movesIndex = 0;
		yourTurn = true;
		colors = new int[]{0,0,0,0};
		font = new BitmapFont();
	}
	
	@Override
	protected void handleInput() {
		// TODO Auto-generated method stub
		if(Gdx.input.isKeyJustPressed(Input.Keys.RIGHT)) {
			if(movesIndex < fighter.getMoves().length-1)
				movesIndex++;
			else
				movesIndex = 0;
		}	
		if(Gdx.input.isKeyJustPressed(Input.Keys.LEFT)) {
			if(movesIndex != 0)
				movesIndex--;
			else
				movesIndex = fighter.getMoves().length-1;
		}
		
		if(Gdx.input.isKeyJustPressed(Input.Keys.ENTER) && yourTurn) {
			attack(enemy);
		}
	}

	@Override
	public void update(float dt) {
		// TODO Auto-generated method stub
		fighter.update(dt);
		enemy.update(dt);
		handleInput();
	}

	@Override
	public void render(SpriteBatch sb) {
		// TODO Auto-generated method stub
			sb.begin();
			sb.draw(fighter.getTexture(), 0, 0,250,250);
			sb.draw(enemy.getTexture(),300,150,250,250);
			font.draw(sb, fighter.getMoves()[movesIndex].getName(), 350, 100);
			font.draw(sb,"Select Your Move:", 350, 125);
			font.draw(sb, "Your Health: " + fighter.getHealth(),150,50);
			font.draw(sb, "dammage done to enemy: " + fighter.getMoves()[movesIndex].getTargetDammage(),400,100);
			font.draw(sb, "dammage done to yourself: " + fighter.getMoves()[movesIndex].getPlayerDammage(),400,85);
			font.draw(sb, "enemy attack dammage: " + fighter.getMoves()[movesIndex].getTargetAttack(),400,70);
			sb.end();
	}
	
	private void attack(Move move) {
			enemy.setHealth(enemy.getHealth() - (move.getTargetDammage() * fighter.getDammage()));
			enemy.setDammage(enemy.getDammage() - move.getTargetDammage());
			fighter.setHealth(fighter.getHealth()-move.getPlayerDammage());
		}
	
	private void takeDammage(Move move) {
		fighter.setHealth(move.get);
	}
}
