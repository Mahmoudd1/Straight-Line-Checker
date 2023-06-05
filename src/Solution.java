class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n=coordinates.length;
        double slope=returnSlope(coordinates[0][0],coordinates[n-1][0],coordinates[0][1],coordinates[n-1][1]);
        for (int i=0;i<n-1;i++)
        {
            if (returnSlope(coordinates[i][0],coordinates[i+1][0],coordinates[i][1],coordinates[i+1][1])!=slope)
                return false;
        }
        return true;
    }
    double returnSlope (int x1,int x2,int y1,int y2)
    {
        int x=x2-x1;
        int y=y2-y1;
        if (x==0)
            return Double.MAX_VALUE;

        return y/x;
    }
}