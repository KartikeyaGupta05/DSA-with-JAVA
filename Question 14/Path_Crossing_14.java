/*
Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.

Example 1:
Input: path = "NES"
Output: false 
Explanation: Notice that the path doesn't cross any point more than once.

Example 2:
Input: path = "NESWW"
Output: true
Explanation: Notice that the path visits the origin twice.

Constraints:
1 <= path.length <= 104
path[i] is either 'N', 'S', 'E', or 'W'.
*/

import java.util.*;

public class Path_Crossing_14 {
    public static boolean isPathCrossing(String path) {
        // Use a set to store visited coordinates
        Set<String> visited = new HashSet<>();
        int x = 0, y = 0;
        // Add the starting position
        visited.add(x + "," + y);
        
        // Process each direction in the path
        for (char direction : path.toCharArray()) {
            switch (direction) {
                case 'N': y++; break;
                case 'S': y--; break;
                case 'E': x++; break;
                case 'W': x--; break;
            }
            String pos = x + "," + y;
            // If this coordinate is already visited, return true
            if (!visited.add(pos)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String path = "NESN";
        System.out.println(isPathCrossing(path));
    }
}