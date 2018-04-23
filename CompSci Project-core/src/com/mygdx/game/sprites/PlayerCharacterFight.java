package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game.other.Move;

public class PlayerCharacterFight {
	private Animation silouette;
	private int[][] animArr;
	private Move[] movesArr;
	public boolean attacking;
	int health;
	int dammage;
	
	public PlayerCharacterFight() {
		animArr = new int[][]{
			{0,1,2,3}
		};
		movesArr = new Move[4];
		movesArr[0] = new Move(5, 0, 0, "Goof");
		movesArr[1] = new Move(9, 2, 0, "Gaff");
		movesArr[2] = new Move(12, 5, 0, "laff");
		movesArr[3] = new Move(0, 0, 0.25, "spoof");	
		
		silouette = new Animation(new TextureRegion(new Texture("playerSilouette.png")),4,0.5f,animArr);
		health = 20;
	}
	
	
		public void update(float dt) {
			silouette.update(dt);
		}
		
		
		public TextureRegion getTexture() {
			return silouette.getFrame();
		}
		
		public Move[] getMoves() {
			return movesArr;
		}
		
		public int getHealth() {
			return health;
		}
		
		public void takeDammage(int n) {
			health -= n;
		}
		
		public int getDammage() {
			return dammage;
		}
		
		public void setHealth(int h) {
			health = h;
		}
		
	private int[][] arr;
	
}
