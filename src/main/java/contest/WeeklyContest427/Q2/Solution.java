package contest.WeeklyContest427.Q2;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public long maxRectangleArea(int[] xCoord, int[] yCoord) {
        int[][] points = new int[xCoord.length][2];
        for (int i = 0; i < xCoord.length; i++) {
            points[i][0] = xCoord[i];
            points[i][1] = yCoord[i];
        }

        Set<String> pointSet = new HashSet<>();
        for (int[] point : points) {
            pointSet.add(point[0] + "/" + point[1]);
        }

        int max = -1;

        for(int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int x1 = points[i][0], y1 = points[i][1];
                int x2 = points[j][0], y2 = points[j][1];


                if(x1 != x2 && y1 != y2) {
                    String conner1 = x1 + "/" + y2;
                    String conner2 = x2 + "/" + y1;

                    if(pointSet.contains(conner1) && pointSet.contains(conner2)){
                        boolean flag = true;

                        for (int[] point : points) {
                            int x = point[0];
                            int y = point[1];

                            if(x > Math.min(x1, x2) && x < Math.max(x1, x2) &&
                                    y > Math.min(y1, y2) && y < Math.max(y1, y2)) {
                                flag = false;
                                break;
                            }

                            if((x == x1 || x == x2 )&&
                                    y > Math.min(y1, y2) && y < Math.max(y1, y2)) {
                                flag = false;
                                break;
                            }
                            if(x > Math.min(x1, x2) && x < Math.max(x1, x2) &&
                                    (y == y1 || y == y2 )) {
                                flag = false;
                                break;
                            }
                        }

                        if(flag){
                            max = Math.max(Math.abs(x1 - x2) * Math.abs(y1 - y2), max);
                        }
                    }
                }
            }
        }
        return  max;
    }
}