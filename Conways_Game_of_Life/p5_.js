console.log("conway's game");

// -----------------------------------------------------------------
// Declare global variables columns,rows and grid
// Declaring a preset
// Creating the 2D array [rows][columns]
// Create assignZerosToTheGrid() to populate the gride with zeros
// Since we are not randomly assigning 1's and 0's
// We will create an assignPresetsToTheGrid(grid,presets) to give it a starting point/state
// inside assignPresetsToTheGrid(rid,presets)
//	- Create a nested forLoop to loop the grid
//	- Create a second nested forLoop to iterate the presets
// 	- Declare a count, row and column postion variable
//	- Match-up the positions and assign 1 as a sign of life
// Creat a setup function
// Inside setup()
// 	- Assign emptygrid() to grid variable
//	- Update grid with assignZerosToTheGrid(grid)
// Create a mod() function to be able to perform a wrapping over the board
// Craete a draw() function (that will loop infinitly)
// Inside draw()
//	- Create a nestde for loop to iterate over the grid
//	- Declare an array to copy the original array(grid)
// Create eight functions that check each side
// Create a countNeighbours(R,  L,  T,  B,  TR,  TL,  BR,  BL) and check every cell in the grid
// Update the board
// 
// -----------------------------------------------------------------

let grid,columns,rows;

let preset = [[4,3],[4,4],[3,3],[2,3]];

function emptyGrid(rows, columns) {
    let grid = new Array(rows);

    for (let i = 0; i < grid.length; i++) {
      grid[i] = new Array(columns);
    }
    return grid;
  }


function setup() {

columns = 12,rows = 8;

grid = emptyGrid(rows,columns);

grid = assignZerosToTheGrid(grid);

grid = assignPresetsToTheGrid(grid,preset);

// grid[4][3]=1;
// if (grid[4][3] == 1) {

// 	console.log(grid[4][3-1]= "P");// left |
// 	console.log(grid[4 - 1][3-1]= "H");// top left |
// 	console.log(grid[4 - 1][3]= "U");// top  |
// 	console.log(grid[4 - 1][3 +1]= "M");// top right |
// 	console.log(grid[4][3 +1]= "L");// right |
// 	console.log(grid[4 +1][3 +1]= "A");// bottom right|
// 	console.log(grid[4 +1][3]= "N");// bottom |
// 	console.log(grid[4 +1][3 - 1]= "I");// bottom left |
// }

// grid[0][1]=8;
// grid[1][2]=8;
// grid[4][3]="THE";
// grid[7][2]=8;

console.table(grid);


// oop();
// oop();
// oop();


}

function draw() {
	let nextGrid = [...grid];
	let counter =0;

	for (let rows = 0; rows < grid.length; rows++) {
		for (let columns = 0; columns < grid[rows].length; columns++) {
			let currentCell = grid[rows][columns];
			let xSize = grid.length;
			let ySize = grid[rows].length;
			let neighbours = countNeighbours(
				left( rows,  columns,  xSize,  ySize,  grid),
				topLeft( rows,  columns,  xSize,  ySize,  grid),
				tp( rows,  columns,  xSize,  ySize,  grid),
				topRight( rows,  columns,  xSize,  ySize,  grid),
				right( rows,  columns,  xSize,  ySize,  grid),
				bottomRight( rows,  columns,  xSize,  ySize,  grid),
				bottom( rows,  columns,  xSize,  ySize,  grid),
				bottomLeft( rows,  columns,  xSize,  ySize,  grid));

			if (currentCell == 0 & neighbours == 3) {
				nextGrid[rows][columns]= 1;
			}else if ((neighbours < 2 | neighbours > 3) & currentCell == 1) {
				nextGrid[rows][columns]= 0;
			}else{
				nextGrid[rows][columns] = currentCell;

			}

			console.log(
				"currrnt c "+currentCell +" --> left "+ left( rows,  columns,  xSize,  ySize,  grid)+
				" TL "+topLeft( rows,  columns,  xSize,  ySize,  grid)+
				" T "+tp( rows,  columns,  xSize,  ySize,  grid)+
				" TR "+topRight( rows,  columns,  xSize,  ySize,  grid)+
				" R "+right( rows,  columns,  xSize,  ySize,  grid)+
				" BR "+bottomRight( rows,  columns,  xSize,  ySize,  grid)+
				" B "+bottom( rows,  columns,  xSize,  ySize,  grid)+
				" BL "+bottomLeft( rows,  columns,  xSize,  ySize,  grid)
				);
		}
	}

	console.table(nextGrid);
	noLoop();
}

function countNeighbours(L,TL,T,TR,R,BR,B,BL) {
	let neighbours = 0;
	if (R == 1) neighbours++;
    if (L == 1) neighbours++;
    if (T == 1) neighbours++;
    if (B == 1) neighbours++;
    if (TR == 1) neighbours++;
	if (TL == 1) neighbours++;
    if (BR == 1) neighbours++;
    if (BL == 1) neighbours++;																																																																																																																																																																																																																																																																																																																																							

    return neighbours;
}

function assignPresetsToTheGrid(grid,presets){

for (let rows = 0; rows < grid.length; rows++) {
		for (let columns = 0; columns < grid[rows].length; columns++) {
			let count = 0, getj = 0, geti = 0;
			
			for (let presetRow = 0; presetRow < preset.length; presetRow++){
				for (let presetColumn = 0; presetColumn < preset[presetRow].length; presetColumn++){
					count++;
					if (count ==1) {
						geti = preset[presetRow][presetColumn];
					}else if (count == 2) {
						getj = preset[presetRow][presetColumn];
						count =0;
						break;
					} 
				}

				if (geti === rows && getj === columns) {
						grid[rows][columns] = 1;
					}
			}

		}
	}

	return grid;
}


function assignZerosToTheGrid(grid) {
	for (let rows = 0; rows < grid.length; rows++) {
		for (let columns = 0; columns < grid[rows].length; columns++) {
			grid[rows][columns]=0;
		}
	}

	return grid;
}

function mod(x,  m) {
    m = Math.abs(m);
    return (x % m + m) % m;
  }


  function left( x,  y,  xSize,  ySize,  grid) {return grid[mod(x,xSize)][mod(y-1,ySize)];}
  function topLeft( x,  y,  xSize,  ySize,  grid) {return grid[mod(x - 1, xSize)][mod(y - 1, ySize)];}
  function tp( x,  y,  xSize,  ySize,  grid) {return grid[mod(x - 1, xSize)][mod(y, ySize)];}
  function topRight( x,  y,  xSize,  ySize,  grid) {return grid[mod(x - 1, xSize)][mod(y + 1, ySize)];}
  function right( x,  y,  xSize,  ySize,  grid) {return grid[mod(x , xSize)][mod(y +1, ySize)];}
  function bottomRight( x,  y,  xSize,  ySize,  grid) {return grid[mod(x + 1, xSize)][mod(y + 1, ySize)];}
  function bottom( x,  y,  xSize,  ySize,  grid) {return grid[mod(x +1, xSize)][mod(y, ySize)];}
  function bottomLeft( x,  y,  xSize,  ySize,  grid) {return grid[mod(x + 1, xSize)][mod(y - 1, ySize)];}




 function oop() {
 	let nextGrid = grid;

	for (let rows = 0; rows < grid.length; rows++) {
		for (let columns = 0; columns < grid[rows].length; columns++) {
			let currentCell = grid[rows][columns];
			let xSize = grid.length;
			let ySize = grid[rows].length;
			let neighbours = countNeighbours(
				left( rows,  columns,  xSize,  ySize,  grid),
				topLeft( rows,  columns,  xSize,  ySize,  grid),
				tp( rows,  columns,  xSize,  ySize,  grid),
				topRight( rows,  columns,  xSize,  ySize,  grid),
				right( rows,  columns,  xSize,  ySize,  grid),
				bottomRight( rows,  columns,  xSize,  ySize,  grid),
				bottom( rows,  columns,  xSize,  ySize,  grid),
				bottomLeft( rows,  columns,  xSize,  ySize,  grid));

			if (currentCell == 0 & neighbours == 3) {
				nextGrid[rows][columns]= 1;
			}else if ((neighbours < 2 | neighbours > 3) & currentCell == 1) {
				nextGrid[rows][columns]= 0;
			}else{
				nextGrid[rows][columns] = grid[rows][columns];

			}

			

			// console.log(
			// 	"currrnt c "+currentCell +" --> left "+ left( rows,  columns,  xSize,  ySize,  grid)+
			// 	" TL "+topLeft( rows,  columns,  xSize,  ySize,  grid)+
			// 	" T "+tp( rows,  columns,  xSize,  ySize,  grid)+
			// 	" TR "+topRight( rows,  columns,  xSize,  ySize,  grid)+
			// 	" R "+right( rows,  columns,  xSize,  ySize,  grid)+
			// 	" BR "+bottomRight( rows,  columns,  xSize,  ySize,  grid)+
			// 	" B "+bottom( rows,  columns,  xSize,  ySize,  grid)+
			// 	" BL "+bottomLeft( rows,  columns,  xSize,  ySize,  grid)
			// 	);
		}
	}
	
	console.table(nextGrid);
	// return nextGrid;
 }

        


        


       





