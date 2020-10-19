class Grid{

	public static void main(String[] args) {
		
		String[][] grid = new String[15][15];

		int yAxis = 7;
		int xAxis =6;


		for(int y=0;y<grid.length;y++){
			for(int x=0;x<grid[y].length;x++){

				if (y == yAxis & x == xAxis) {
					System.out.println("true");
					grid[x][y] = "P";

                    // Left 
                    // System.out.println("Left value "+grid[xAxis-1][yAxis]); // left
                    grid[xAxis-1][yAxis] = "H"; // Left

                     // Top left
                     // System.out.println("Top left value "+grid[xAxis-1][yAxis- 1]); // top le
                     grid[xAxis-1][yAxis- 1] = "U"; // top left


                     // Top 
                     // System.out.println("Top value "+grid[xAxis][yAxis -1]); // top le
                     grid[xAxis][yAxis- 1] = "M"; // Top


                 }else{
                 	grid[x][y] = ""+x;

                 }


             }

                    // Right
                    // System.out.println("Right value "+grid[xAxis +1][yAxis]); // Right
                    grid[xAxis + 1][yAxis] = "A"; // Right


                    // Top Right
                    // System.out.println("Top Right value "+grid[xAxis +1][yAxis - 1]); // Right
                    grid[xAxis +1][yAxis - 1] = "L"; // Right


                    // Bottom Right
                    // System.out.println("Bottom Right value "+grid[xAxis +1][yAxis + 1]); // Bottom Right
                    grid[xAxis +1][yAxis + 1] = "N"; // Bottom Right


                     // Bottom 
                    // System.out.println("Bottom  value "+grid[xAxis][yAxis + 1]); // Bottom
                    grid[xAxis ][yAxis+1 ] = "I"; //Bottom


                    // Bottom Left
                    System.out.println("Bottom  value "+grid[xAxis -1][yAxis +1]); // Bottom left
                    grid[xAxis -1][yAxis +1 ] = "D"; //Bottom Left

                }

                int incr = 0;
                for (int r = 0; r<grid.length;r++){
                	String line = "";

                	for (int c = 0; c <grid.length;c++){
                		line+="["+grid[c][r]+"]";
                	}
                	System.out.println("col"+incr +" "+line);
                	incr++;
                }


            }
        }




