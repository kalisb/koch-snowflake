/**
 * 
 */
package org.fmi.fractals.api;
import processing.core.PApplet;

/**
 * Extends PApplet to provide a Processing environment to draw the graphics.
 * @author kalisb
 *
 */
public abstract class Controls extends PApplet {

	/*
	 * General fractal variables
	 */
	protected float scaleFactor;   
	protected float translateX;    
	protected float translateY;   
	 //arrow key scroll speed, fixed
	protected static final float speed = 20;
	protected int minLength;      

	/**
	 * Processing setup, executed at runtime by PApplet,
	 * and calls specific fractalSetup() method
	 * for each fractal class
	 */
	public void setup(){
		size(800,800);
		scaleFactor = 1;
		fractalSetup();
	}
	
	/**
	 * Zooming aid; cross by default
	 */
	protected void visor(){
		strokeWeight((float) 1.5);
		stroke(255,0,0);
		line(width/2-50,height/2,width/2+50,height/2);
		line(width/2,height/2-50,width/2,height/2+50);
	}
	
	//specific setup for each fractal
	protected abstract void fractalSetup(); 
	
	//reset screen
	protected abstract void reset(); 
	
	//keyboard controls
	public abstract void keyPressed();


}
