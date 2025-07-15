package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        boolean[][] grid = new boolean[10][10];
        ShipPlacement horizontalPlacement = new HorizontalShipPlacement(grid);
        ShipPlacement verticalPlacement = new VerticalShipPlacement(grid);


        for (Ships ship : Ships.values()) {
            ShipPlacement placement = ship.getRandomPlacement(horizontalPlacement, verticalPlacement);
            boolean placed = false;

            while (!placed) {
                int row = new Random().nextInt(10);
                int col = new Random().nextInt(10);
                placed = placement.placeShip(row, col, ship.length);
            }
        }

        // Print the resulting board
        System.out.println("\nFinal Board:");
        verticalPlacement.printGrid();
    }

    public enum Ships {
        CARRIER(5),
        BATTLESHIP(4),
        CRUISER(3),
        SUBMARINE(3),
        DESTROYER(2);

        public final int length;

        Ships(int length) {
            this.length = length;
        }


        public ShipPlacement getRandomPlacement(ShipPlacement horizontal, ShipPlacement vertical) {
            return new Random().nextBoolean() ? horizontal : vertical;
        }
    }
}
