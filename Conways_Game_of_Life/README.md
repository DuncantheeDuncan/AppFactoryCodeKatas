# Conway's Game of Life

	Phumlani Mthembu
	2020/10/15
	John Conway Game of life


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
	

# P5 Installation Instructions
 	VS Code
	
  1. from VSCode got to extensions tab and type **P5.vscode**
  2. click install (now that is installed, you need to create a p5 project)
  3. locate command pallate from IDE and type p5
  4. select libraries/p5.gui.js to create a p5 project from the tray(it will ask for the location to save your project and/ or create a project if you haven't done that already)
  5. by now you should have a folder with files i.e sketch.js
  6. to start the server, on your IDE at the bottom left click **go live icon**
  7. your app will be up and running in no time.
	
  **OR If you do not want to run your project on a sever** NB tested with Sublime text 2 and 3
	
	Sublime text 3
1. create a project folder as usual
2. you need to create two files for this:
	- HTML
	- JavaScript
3. link your JS file with HTML
4. insert this magic script tag
```html
<html>
	<head>
      		<script src="https://cdn.jsdelivr.net/npm/p5@1.1.9/lib/p5.js"></script>
		<script src="grid.js"></script>
      </head>

</html>

```
5. Run the HTML file as you would normally.

    
