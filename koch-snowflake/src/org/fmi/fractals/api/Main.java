/**
 * 
 */
package org.fmi.fractals.api;

import javax.swing.UIManager;
import processing.core.PApplet;

/**
 * Main class starting the program
 * @author kalisb
 *
 */
public class Main {

	/**
	 * Main method to start the program - starts the GUI
	 * @param args
	 */
	public static void main(String[] args) {
		// Mac OSX integration; set application name in menu bar, with exception handler
		try {
			System.setProperty("apple.laf.useScreenMenuBar", "true");
			System.setProperty("com.apple.mrj.application.apple.menu.about.name",
					"Koch Snowflake Visualization Software");
		} catch (Exception e){
			System.out.println("Couldn't set Apple properties");
		}

		// Try to get system look and feel; if impossible, default LaF will be used
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		} 

		// Start Launcher GUI
		PApplet.main("org.fmi.fractals.internal.KochSnowflake");
	}

}
