package com.csplusplus;

public class Unit8 {

    // 1. Method to calculate the sum of all elements in a 2D array
    // Instructions: Traverse the 2D array and calculate the sum of all elements.
    public static int sumOfElements(int[][] array) {
        // TODO: Implement this method
    	int sum = 0;
    	for(int row = 0; row < array.length; row++) {
    		for(int col = 0; col < array[row].length; col++){
    			sum += array[row][col];
    		}
    	}
        return sum;  // Placeholder return value
    }

    // 2. Method to count how many times a specific number appears in a 2D array
    // Instructions: Traverse the 2D array and count the number of times a specified value appears.
    public static int countOccurrences(int[][] array, int value) {
    	int num = 0;
    	for(int row = 0; row < array.length; row++) {
    		for(int col = 0; col <array[row].length; col++) {
    			if(value == array[row][col]) {
    				num++;
    			}
    		}
    	}
        // TODO: Implement this method
        return num;  // Placeholder return value
    }

    // 3. Method to find the maximum element in a 2D array
    // Instructions: Traverse the 2D array and find the maximum element.
    public static int findMax(int[][] array) {
    	int max = Integer.MIN_VALUE; //Sets it to the minimum possible value 
    	for(int row = 0; row < array.length; row++) {
    		for(int col = 0; col <array[row].length; col++) {
    			if(array[row][col] > max) {
    				max = array[row][col];
    			}
    		}
    	}
        // TODO: Implement this method
        return max;  // Placeholder return value
    }

    // 4. Method to reverse the rows of the 2D array
    // Instructions: Reverse the rows of the 2D array (e.g., the first row becomes the last, etc.).
    public static void reverseRows(int[][] array) {
    	for(int row = 0; row < array.length/2; row++) {
    		for(int col = 0; col < array[row].length; col++){
    			int old = array[row][col];
    			array[row][col] = array[array.length-row -1][col];
    			array[array.length - row -1][col]  = old;
    		}
    	}
         // TODO: Implement this method
    }

    // 5. Method to transpose a 2D array (swap rows and columns)
    // Instructions: Create and return a new 2D array that is the transpose of the input array.
    public static int[][] transpose(int[][] array) {
        // TODO: Implement this method
    	int [][] newArray = new int[array[0].length][array.length];
    	for(int row = 0; row < array.length; row++) {
    		for(int col = 0; col < array[row].length; col++) {
    			newArray[col][row] = array[row][col];
    		}
    	}
        return newArray;  // Placeholder return value
    }

    // 6. Method to fill a 2D array with random integers
    // Instructions: Create a 2D array of size numRows x numCols and fill it with random integers between min and max.
    public static int[][] fillWithRandom(int min, int max, int numRows, int numCols) {
        // TODO: Implement this method
    	int[][] matrix = new int[numRows][numCols];
    	for(int row = 0; row < matrix.length; row++) {
    		for(int col = 0; col <matrix[row].length; col++) {
    			matrix[row][col] = (int)(Math.random()*(max-min+1)+min);
    		}
    	}
    	
        return matrix;  // Placeholder return value
    }
}