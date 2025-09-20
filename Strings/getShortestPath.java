package Strings;
public class getShortestPath {
    public static float getShortestPath(String path){
        int x = 0;
        int y = 0;
        for(int i = 0; i < path.length(); i++){
            char dir = path.charAt(i); 
            // South
            if (dir == 's'){
                y--;
            }
            //North
            if(dir == 'n'){
                y++;
            }
            // East
            else if(dir == 'e'){
                x++;
            }
            // West
            else if(dir == 'w'){
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String args[]){
        String path = "ns";
        System.out.println(getShortestPath(path));
    }
}
