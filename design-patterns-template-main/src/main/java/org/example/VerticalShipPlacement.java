package org.example;

public class VerticalShipPlacement extends ShipPlacement{
    public VerticalShipPlacement(boolean[][] grid) {
        super(grid);
    }

    @Override
    protected boolean validateFit(int startRow, int startCol, int length) {
        return (startRow + length) <= gridSize;
    }

    @Override
    protected boolean checkCells(int startRow, int startCol, int length) {
        for (int i = 0; i < length; i++) {
            if(grid[startRow + i][startCol]){
                return false;
            }
        }
        return true;
    }

    @Override
    protected void markCells(int startRow, int startCol, int length) {
        for (int i = 0; i < length; i++) {
            grid[startRow + i][startCol] = true;
        }
    }
}
