package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.CompSciGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = CompSciGame.WIDTH;
		config.height = CompSciGame.HEIGHT;
		config.title = CompSciGame.TITLE;
		new LwjglApplication(new CompSciGame(), config);
	}
}
