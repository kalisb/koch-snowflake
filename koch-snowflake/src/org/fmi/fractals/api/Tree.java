/**
 * 
 */
package org.fmi.fractals.api;

/**
 * @author kalisb
 *
 */
public abstract class Tree extends Controls {

	// tree initial branch length
	protected float init_len = 0;

	// old branch/frac = new branch
	protected float frac = 0;    

	// angle offset between branches
	protected float offset = 0;   

	// stroke weight
	protected float stroke;

	/**
	 * Keyboard controls.
	 */
	@Override
	public void keyPressed(){
		switch(key){
			//mouse move
			case ' ':
				if (minLength == 0 || minLength == -1) {
					translateX = (mouseX - width / 2) / scaleFactor;
					translateY = (mouseY - width / 2) / scaleFactor + 200;
				}
				break;
	
			//reset
			case 'r':
				reset();
				break;
	
			//zoom in
			case 'a':
				scaleFactor *= 2;
				stroke /= 2;
				minLength += 1;
				println(scaleFactor + "x zoom");
				break;
	
			//zoom out
			case 'z':
				scaleFactor /= 2;
				stroke *=2;
				minLength -= 1;
				println(scaleFactor + "x zoom");
				break;
		}
		switch(keyCode){
			case UP:
				translateY += (speed / scaleFactor);
				break;
			case DOWN:
				translateY -= (speed / scaleFactor);
				break;
			case LEFT:
				translateX += (speed / scaleFactor);
				break;
			case RIGHT:
				translateX -= (speed / scaleFactor);
				break;
			case ENTER:
				offset = radians(mouseX / 10);
				break;
		}
	}
}
