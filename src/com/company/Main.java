package com.company;

public class Main {

    public static class Jarvis {

        public void ispisi(Point[] points, int[] next) {
            System.out.println("\nTacke : ");
            for (int i = 0; i < next.length; i++)
                if (next[i] != -1)
                    System.out.println("(" + points[i].x + ", " + points[i].y + ")");
        }

        private boolean orijentacija(Point p, Point q, Point r) {
            int val = (q.y - p.y) * (r.x - q.x) - (q.x - p.x) * (r.y - q.y);

            if (val >= 0)
                return false;
            return true;
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
