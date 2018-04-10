package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class DialogueState extends State{
	private final String[] TEST = {
			"Hi",
			"Hello",
			"Ur Mum Gay",
			"No U",
			"Gotteem"
	};
	private int dialogueIndex;
	private BitmapFont font;
	
	public DialogueState(GameStateManager gsm) {
		super(gsm);
		font = new BitmapFont();
	}
	
	@Override
	protected void handleInput() {
		// TODO Auto-generated method stub
		if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE)){
			dialogueIndex++;
		}
	}

	@Override
	public void update(float dt) {
		// TODO Auto-generated method stub
		handleInput();
		
	}

	@Override
	public void render(SpriteBatch sb) {
		// TODO Auto-generated method stub
		sb.begin();
		font.draw(sb,TEST[dialogueIndex],100,100);
		sb.end(); 
	}

}
