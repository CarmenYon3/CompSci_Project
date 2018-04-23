package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class CrushFight extends Enemy{
	private Animation silouette;
	private int[][] arr;
	
	public CrushFight(int h, int d, int aM) {
		super(h,d);
		arr = new int[][]{
			{0,1,2,3}
		};
		silouette = new Animation(new TextureRegion(new Texture("CrushStickFigure.png")),4,0.5f,arr);
	}
	
		public void update(float dt) {
			silouette.update(dt);
		}
		
		public TextureRegion getTexture() {
			return silouette.getFrame();
		}
}
