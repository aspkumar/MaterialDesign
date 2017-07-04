package com.example.prasannakumara.materialdesign.fluid2d;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 12/11/12
 * Time: 19:23
 */
public interface Display {
	void draw(Sprite... sprites);
	int getDisplayWidth();
	int getDisplayHeight();
	boolean isRunning();
	int[] getColors();

	void clear(Sprite[] sprites);
}
