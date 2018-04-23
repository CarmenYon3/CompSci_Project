package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game.other.Move;

public abstract class Enemy {
	protected int health;
	protected int dammage;
	
	public Enemy(int h, int d) {
		health = h;
		dammage = d;
	}

	public abstract void update(float dt);
	public abstract TextureRegion getTexture();
	public int getHealth() {
		return health;
	}
	public int getDammage() {
		return dammage;
	}
	public void setHealth(int h) {
		health = h;
	}
	public void setDammage(int d) {
		dammage = d;
	}
		
}
