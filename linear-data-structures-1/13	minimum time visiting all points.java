class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int total_time = 0;
        for(int i=1; i<points.length; i++){
            int t = minTimeToVisitTwoConsecutivePoints(points[i-1], points[i]);
            // System.out.println(""+t);
            total_time+=t;
        }
        return total_time;
        
    }
    public int minTimeToVisitTwoConsecutivePoints(int[] a, int[] b){
        int xa = a[0];
        int ya = a[1];
        int xb = b[0];
        int yb = b[1];

        return Math.max(Math.abs(xa-xb), Math.abs(ya-yb));
    }
}