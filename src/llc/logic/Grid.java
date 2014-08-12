package llc.logic;


/**
 * Represents a loaded Grid
 */
public class Grid {
	
	/**
	 * Two dimensional array of cells. The first index represents the y-axis, the second one the x-axis
	 * Starts at 0!
	 */
	private Cell[][] cells;
	
	public Grid(int height, int width) {
		cells = new Cell[height][width];
	}
	
	/**
	 * Gets all the cells in this grid
	 * @return all cells
	 */
	public Cell[][] getCells() {
		return cells;
	}
	/**
	 * Gets the cell at the given coordinates
	 * @param x the x-value
	 * @param y the y-value
	 * @return the cell
	 */
	public Cell getCellAt(int x, int y) {
		return cells[y][x];
	}
	
	public void setCellAt(Cell c, int x, int y) {
		cells[y][x] = c;
	}
}