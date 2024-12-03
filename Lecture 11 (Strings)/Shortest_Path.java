public class Shortest_Path {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            // North
            if (dir == 'N') {
                y++;
            } 
            
            // South
            else if (dir == 'S') {
                y--;
            } 
            
            // East
            else if (dir == 'E') {
                x++;
            } 
            
            // West
            else{
                x--;
            }
        }

        double shortestPath = Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));  // using formula used in image. 
        System.out.println("Shortest path is = " + shortestPath);
    }
}
