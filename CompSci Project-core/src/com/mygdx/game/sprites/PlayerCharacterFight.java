package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class PlayerCharacterFight {
	private Animation silouette;
	private int[][] arr;
	
	public PlayerCharacterFight() {
		arr = new int[][]{
			{0,1,2,3}
		};
		silouette = new Animation(new TextureRegion(new Texture("playerSilouette.png")),4,0.5f,arr);
	}
	
		public void update(float dt) {
			silouette.update(dt);
		}
		
		public TextureRegion getTexture() {
			return silouette.getFrame();
		}
}
