package org.example;

public class HorizontalShipPlacement extends ShipPlacement {
    public HorizontalShipPlacement(boolean[][] grid) {
        super(grid);
    }

    @Override
    protected boolean validateFit(int startRow, int startCol, int length) {
        return (startCol + length) <= gridSize;
    }

    @Override
    protected boolean checkCells(int startRow, int startCol, int length) {
        for (int i = 0; i < length; i++) {
            if(grid[startRow][startCol + i]){
                return false;
            }
        }
        return true;
    }

    @Override
    protected void markCells(int startRow, int startCol, int length) {
        for (int i = 0; i < length; i++) {
            grid[startRow][startCol + i] = true;
        }
    }
}
