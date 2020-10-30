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
    - if you are running the app with maven
        - no steps available yet.
    - if you are not using Maven
        - locate this folder gameOfLife/Grid.java
        - you can run the app from anywhere except from the 'gameOfLife' package
        - Compile the application 	
        		`$ javac gameOfLife/Grid.java`

        - Run the application
        		`$ java gameOfLife.Grid`
      

# TESTS

## Two ways to run tests
###  IDE wit Maven
 - Use an IDE that support Maven
 - If the project did not change automatically do it manually

### Terminal/Command line
    Note* you will still need maven configured on your machine
- To run a single test from the root folder type `mvn -Dtest=BoardEmptyGridTest test`
- To run tests from this project:
    - `mvn -Dtest=BoardEmptyGridTest,BoardInitializePresetTest test`
    - `mvn -Dtest=BoardTest test`
    - `mvn -Dtest=BoardThirdGenTest test`
- to run all those commands at once

        Note* you will need to change the extention of the 
        file if your are not using UBUNTU/LINUX i.e for windows it will be run.bash
  - From the root folder ` ./run.sh` 


