
  // global variables
//  let grid;
//  let columns;
//  let rows;
//  let pixels = 40;// size of the box making grid dynamic

  /*
                setup()

  - this function is called once when the program starts
  - it defines environment properties such as
    - setting up a screen
    - background color
  - there can only be one setup function

            createCanvas()

  - this function should be called only once in setup at the start
  - it has height and width
  -  default ias 100 x 100 pixels
  - parameters createCanvas(w,h)
  */


let grid;
function setup(){
// create an empty canvas with 5oo width and height of 400 pixels
//CreateCanvas(rows,heights);

//let preset = emptyGrid(10,9);

let preset = [[4,3],[4,4],[4,2],[5,4]];

//give grid a h * w(empty)
grid = emptyGrid(18,18);

for(let i=0;i<grid.length;i++){
for(let j=0; j<grid[i].length;j++){

//assign zeros
grid[i][j] =0;
if(grid[i][j] == preset[i][j]){ // last stop
console.log("true");
}

}
}

console.table(grid);



}

 function emptyGrid(columns, rows) {
    let grid = new Array(columns);

    for (let i = 0; i < grid.length; i++) {

      grid[i] = new Array(rows);
    }
    return grid;
  }

//  function setup() {
//  createCanvas(118, 118);
//
//    columns = width / pixels;
//    rows = height / pixels;
//
//    grid = makeGrid(columns, rows);

//    making an empty 2D  array structure to iterate  on every block of column and rows
//   to store a random number
//    for (let i = 0; i < columns; i++) {
//      for (let j = 0; j < rows; j++) {
//         limits our random numbers to 1 or 0
//        grid[i][j] = floor(random(2));
//      }
//    }
//  }


  function draw() {
    // making background black and only draw live cells | 1
    background(0);

//    for (let i = 0; i < columns; i++) {
//      for (let j = 0; j < rows; j++) {
//        // width by 40
//        let x = i * pixels;
//        let y = j * pixels;
//
//        if (grid[i][j] == 1) {
//          fill("yellow");
//          stroke(0);
//          rect(x, y, pixels - 1, pixels - 1);
//        }
//      }
//    }

//    let next = makeGrid(columns, rows);

    
//    for (let i = 0; i < columns; i++) {
//      for (let j = 0; j < rows; j++) {
//        let state = grid[i][j];
//        // console.log(grid[i][j]);
//
//
//
//        // Count live neighbors!
//        let sum = 0;
//        let neighbors = neighborCount(grid, i, j);
//
//        // implementing the rules of the game!!
//        if (state == 0 && neighbors == 3) {
//          next[i][j] = 1;
//        } else if (state == 1 && (neighbors < 2 || neighbors > 3)) {
//          next[i][j] = 0;
//        } else {
//          next[i][j] = state;
//        }
//      }
//    }

//    grid = next;
  }



//  function makeGrid(columns, rows) {
//
//    let arr = new Array(columns);
//
//    for (let i = 0; i < arr.length; i++) {
//
//      //  making index i as new array of rows
//      arr[i] = new Array(rows);
//    }
//    return arr;
//  }


  // |
//  function neighborCount(grid, x, y) {
//    let sum = 0;
//    for (let i = -1; i < 2; i++) {
//      for (let j = -1; j < 2; j++) {
//        let col = (x + i + columns) % columns;
//        let row = (y + j + rows) % rows;
//        sum += grid[col][row];
//      }
//    }
//
//    sum -= grid[x][y]; // exclude the current cell from the sum
//    return sum;
//
//
//  }

