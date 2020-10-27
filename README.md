# Conway's Game of Life

	Phumlani Mthembu
	2020/10/26
	John Conway's Game of life | Java version


### Rules
- The universe of the Game of Life is an infinite, two-dimensional orthogonal grid of square cells, each of which is in one of two possible states, **live or dead**. 
- Every cell interacts with its eight neighbours, which are the cells that are 
	- horizontally
	- vertically
	- diagonally adjacent


### The following transitions occur:
	1 Any live cell with fewer than two live neighbours dies, as if by underpopulation.
	2 Any live cell with two or three live neighbours lives on to the next generation.
	3 Any live cell with more than three live neighbours dies, as if by overpopulation.
	4 Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.


### How to run the app
- one you repo is downloaded to your local machine
    - if you are runing the app with maven
        - no steps availabe yet.
    - if you are not using Maven
        - locate this folder gameOfLife/Grid.java
        - you can run the app from anywhere except from the 'gameOfLife' package
        - ~$ javac gameOfLife/Grid.java
        - ~$ java gameOfLife.Grid

### Creating tests
### Creating JAR file
