package com.example.pikatptcha.process;

public class GridProcess {

	public static int calculate_nb_of_zere(String[][] grid, int i, int j) {
		int count = 0;
		int heigth = grid.length;
		int width = grid[0].length;
		// case au dessus
		if (i - 1 >= 0 && grid[i - 1][j].equals("0")) {
			count++;
		}
		// case en dessous
		if (i + 1 < heigth && grid[i + 1][j].equals("0")) {
			count++;
		}
		// case a gauche
		if (j - 1 >= 0 && grid[i][j - 1].equals("0")) {
			count++;
		}
		// case a droite
		if (j + 1 < width && grid[i][j + 1].equals("0")) {
			count++;
		}

		return count;
	}
}
