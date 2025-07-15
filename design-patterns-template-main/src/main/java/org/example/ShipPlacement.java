package org.example;

abstract class ShipPlacement {
    protected final int gridSize = 10;
    protected boolean[][] grid;

    public ShipPlacement(boolean[][] grid) {
        this.grid = grid;
    }


    public final boolean placeShip(int startRow, int startCol, int length) {
        if (!fitsInGrid(startRow, startCol, length)) {
            System.out.println("Ship doesn't fit within the grid!");
            return false;
        }
        if (!cellsAreFree(startRow, startCol, length)) {
            System.out.println("Cells are already occupied!");
            return false;
        }
        occupyCells(startRow, startCol, length);
        System.out.println("Ship placed successfully!");
        return true;
    }

    private boolean fitsInGrid(int startRow, int startCol, int length) {
        return validateFit(startRow, startCol, length);
    }

    private boolean cellsAreFree(int startRow, int startCol, int length) {
        return checkCells(startRow, startCol, length);
    }

    private void occupyCells(int startRow, int startCol, int length) {
        markCells(startRow, startCol, length);
    }

    protected abstract boolean validateFit(int startRow, int startCol, int length);
    protected abstract boolean checkCells(int startRow, int startCol, int length);
    protected abstract void markCells(int startRow, int startCol, int length);

    public void printGrid() {
        for (boolean[] row : grid) {
            for (boolean cell : row) {
                System.out.print(cell ? " X " : " . ");
            }
            System.out.println();
        }
    }
}
