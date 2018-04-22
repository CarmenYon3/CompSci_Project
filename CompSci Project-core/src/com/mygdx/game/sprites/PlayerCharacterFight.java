package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class PlayerCharacterFight {
	private Animation silouette;
<<<<<<< HEAD
	private int[][] animArr;
	private String[] movesArr;
	public boolean attacking;
	int health;
	
	public PlayerCharacterFight() {
		animArr = new int[][]{
			{0,1,2,3}
		};
		movesArr = new String[]{"Goof","Gaff","Goob","Laugh"};
		silouette = new Animation(new TextureRegion(new Texture("playerSilouette.png")),4,0.5f,animArr);
		health = 20;
	}
	
	
		public void update(float dt) {
			silouette.update(dt);
		}
		
		
		public TextureRegion getTexture() {
			return silouette.getFrame();
		}
		
		public String[] getMoves() {
			return movesArr;
		}
		
		public int getHealth() {
			return health;
		}
		
		public void takeDammage(int n) {
			health -= n;
		}
		
		
=======
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
>>>>>>> refs/remotes/origin/master
}
