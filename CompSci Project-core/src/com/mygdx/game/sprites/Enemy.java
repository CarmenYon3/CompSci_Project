package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public abstract class Enemy {
	protected int health;
	protected int dammage;
	
	public Enemy(int h, int d) {
		health = h;
		dammage = d;
	}

	public abstract void update(float dt);
	public abstract TextureRegion getTexture();
		
}
