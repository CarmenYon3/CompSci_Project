package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class NonPlayerCharacterWalk {

	private Animation test;
	private Rectangle bounds;
	private int[][] arr;
	private Vector2 position;
	
	
	public NonPlayerCharacterWalk(int x, int y) {
		arr = new int[][]{
			{0,1,2,3,4,5}
		};
		position = new Vector2(x,y);
		test = new Animation(new TextureRegion(new Texture("spriteSheetTest.png")),6,0.5f,arr);
		bounds = new Rectangle(x, y, test.getFrame().getRegionWidth(), test.getFrame().getRegionHeight());
	}
	
	public void update(float dt) {
		test.update(dt);
	}
	
	public TextureRegion getTexture() {
		return test.getFrame();
	}
	
	public Rectangle getBounds() {
		return bounds;
	}


	public Vector2 getPosition() {
		return position;
	}
	
	public boolean collides(Rectangle player) {
		return player.overlaps(bounds);
	}
	
	public void setAnimation(int index) {
		test.setAnimation(index);
	}
}
