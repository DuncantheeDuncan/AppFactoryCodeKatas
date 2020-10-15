  // Phumlani Mthembu
  // 2020/10/15
  // John Conway Game of Life 

  /** 
  The Rules
  For a space that is 'populated':
  Each cell with one or no neighbors dies, as if by solitude.
  Each cell with four or more neighbors dies, as if by overpopulation.
  Each cell with two or three neighbors survives.
  For a space that is 'empty' or 'unpopulated'
  Each cell with three neighbors becomes populated.


  Step by step Description

  key 
    - dead lives  = 0
    - alive lives = 1

  - set up a canvas and specify a width and height
  - rows equals height divided by pixels 
  - columns equals  width divided by pixels  
   The bigger the square less squires on the grid


  - create a draw method
  -  create a rec to have a grid

  -  create a counting neighbors method
   - do not include the current cell sell as a neighbor
   - have edges a fixed values 

  -  created an Array Of Arrays to represent column and rows
  - that will store 0's and 1's


  */


  // global variables
  let grid;
  let columns;
  let rows;
  let pixels = 40;// size of the box making grid dynamic

  // setting up a canvas
  function setup() {
  createCanvas(800, 600);

    columns = width / pixels;
    rows = height / pixels;

    grid = makeGrid(columns, rows);

  //  making an empty 2D  array structure to iterate  on every block of column and rows
  // to store a random number 
    for (let i = 0; i < columns; i++) {
      for (let j = 0; j < rows; j++) {
        // limits our random numbers to 1 or 0
        grid[i][j] = floor(random(2));
      }
    }
  }


  function draw() {
    // making background black and only draw live cells | 1
    background(0);

    for (let i = 0; i < columns; i++) {
      for (let j = 0; j < rows; j++) {
        // width by 40
        let x = i * pixels;
        let y = j * pixels;

        if (grid[i][j] == 1) {
          fill("yellow");
          stroke(0);
          rect(x, y, pixels - 1, pixels - 1);
        }
      }
    }

    let next = makeGrid(columns, rows);

    
    for (let i = 0; i < columns; i++) {
      for (let j = 0; j < rows; j++) {
        let state = grid[i][j];
        // console.log(grid[i][j]);



        // Count live neighbors!
        let sum = 0;
        let neighbors = neighborCount(grid, i, j);

        // implementing the rules of the game!!
        if (state == 0 && neighbors == 3) {
          next[i][j] = 1;
        } else if (state == 1 && (neighbors < 2 || neighbors > 3)) {
          next[i][j] = 0;
        } else {
          next[i][j] = state;
        }
      }
    }

    grid = next;
  }



  function makeGrid(columns, rows) {

    let arr = new Array(columns);

    for (let i = 0; i < arr.length; i++) {

      //  making index i as new array of rows
      arr[i] = new Array(rows);
    }
    return arr;
  }


  // |
  function neighborCount(grid, x, y) {
    let sum = 0;
    for (let i = -1; i < 2; i++) {
      for (let j = -1; j < 2; j++) {
        let col = (x + i + columns) % columns;
        let row = (y + j + rows) % rows;
        sum += grid[col][row];
      }
    }

    sum -= grid[x][y]; // exclude the current cell from the sum
    return sum;
  }

