package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class Animation {
	private Array<TextureRegion> frames;
    private float maxFrameTime;
    private float currentFrameTime;
    private int frameCount;
    private int frame;
    private int curAnimation;
    private int[][] animations;

    public Animation(TextureRegion region, int frameCount, float cycleTime, int[][] animations){
        frames = new Array<TextureRegion>();
        int frameWidth = region.getRegionWidth() / frameCount;
        for(int i = 0; i < frameCount; i++){
            frames.add(new TextureRegion(region, i * frameWidth, 0, frameWidth, region.getRegionHeight()));
        }
        this.frameCount = frameCount;
        maxFrameTime = cycleTime / frameCount;
        frame = 0;
        this.animations = animations;
    }

    public void update(float dt){
        currentFrameTime += dt;
        if(currentFrameTime > maxFrameTime){
            frame++;
            currentFrameTime = 0;
        }
        if(frame >= animations[curAnimation].length)
            frame = 0;
    }

    public TextureRegion getFrame(){
        return frames.get(animations[curAnimation][frame]);
    }
    
    public void setAnimation(int index) {
    	if(index != curAnimation) {
    	curAnimation = index;
    	frame = 0;
    	}
    }
}
