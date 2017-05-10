package br.com.bots.model;

import javafx.stage.Screen;

public class Pixel {

	private int x;
	private int y;
	private int screenId;
	
	public Pixel(int x, int y){
		this.x = x;
		this.y = y;
		screenId = 0;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public Pixel changeScreen(){
		
		if(Screen.getScreens().size() < 2){
			return this; // Do nothing if only one screen is present
		}

		double prevHeight = Screen.getScreens().get(screenId).getVisualBounds().getHeight();
		double prevWidth = Screen.getScreens().get(screenId).getVisualBounds().getWidth();
		
		if(screenId == 0){
			screenId = 1;
		}
		else{
			screenId = 0;
		}
		
		double nextHeight = Screen.getScreens().get(screenId).getVisualBounds().getHeight();
		double nextWidth = Screen.getScreens().get(screenId).getVisualBounds().getWidth();
		
		// TODO changeScreen logic
		
		return new Pixel((int) (nextHeight - prevHeight), (int) (nextWidth - prevWidth));
	}
}
