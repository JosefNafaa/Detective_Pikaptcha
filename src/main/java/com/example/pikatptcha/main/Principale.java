package com.example.pikatptcha.main;

import com.example.pikatptcha.process.GridProcess;

public class Principale {

	public static void main(String[] args) {

		String[][] grid = { { "0", "0", "0", "0", "#" },
				{ "#", "0", "#", "0", "0" }, 
				{ "0", "0", "#", "0", "#" } };
		int heigth = grid.length;
		int width = grid[0].length;
		String[][] gridResult = new String[heigth][width];
		System.out.println("Grille d'entrée :");
		for(int i=0;i<heigth;i++){
            for(int j=0;j<width;j++){
                
                System.out.print(grid[i][j]);
               
            }
            System.out.println();
        }	
		for (int i = 0; i < heigth; i++) {
			for (int j = 0; j < width; j++) {
				if (grid[i][j].equals("#"))
					gridResult[i][j] = "#";
				else if (grid[i][j].equals("0"))
				
				gridResult[i][j] = 	 Integer.toString(GridProcess.calculate_nb_of_zere(grid, i, j));
			}

		}
		
		System.out.println("Grille resultat :");
		for(int i=0;i<heigth;i++){
            for(int j=0;j<width;j++){
                
                System.out.print(gridResult[i][j]);
               
            }
            System.out.println();
        }	

	}
}