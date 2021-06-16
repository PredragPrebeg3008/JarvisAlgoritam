package com.company;

public class Main {

    public static class Jarvis {

        public void ispisi(Point[] points, int[] next) {
            System.out.println("\nTacke : ");
            for (int i = 0; i < next.length; i++)
                if (next[i] != -1)
                    System.out.println("(" + points[i].x + ", " + points[i].y + ")");
        }
      
    }

    static class Point {
        int x;
        int y;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
