package com.MinMaxArray;

public class MaxMinFinder <T extends Comparable<T>> implements FindMaxMin<T> {

	@Override
	public T findMax(T[] array) {
		T max=array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
	}

	@Override
	public T findMin(T[] array) {
		 T min = array[0];
	        for (T element : array) {
	            if (element.compareTo(min) < 0) {
	                min = element;
	            }
	        }
	        return min;
	}

}
