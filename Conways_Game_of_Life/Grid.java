class Grid{

	public static void main(String[] args) {
		
		String[][] grid = new String[15][15];

// String[][] update = "P";

		int yAxis = 7;
		int xAxis =6;


		for(int y=0;y<grid.length;y++){
			for(int x=0;x<grid[y].length;x++){

				if (y == yAxis & x == xAxis) {
					System.out.println("true");
					grid[x][y] = "P";
					System.out.println("before value "+grid[xAxis-1][yAxis- 1]);
					System.out.println("current value "+grid[xAxis][yAxis]);


				}else{
					grid[x][y] = ""+x;

				}


			}
					System.out.println("after value "+grid[xAxis+1][yAxis+1]);
					System.out.println("top of current value ??"+grid[xAxis+1][yAxis+1]);
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




