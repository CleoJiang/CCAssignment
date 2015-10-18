package test;

/**
 * Created by apple on 10/13/15.
 */
import java.util.*;
public class route {

    public static long[] getPath(char [][] map){

        long result[] = new long[2];
        int r=map.length;
        int c= map[0].length;
        int[][] path = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                path[i][j] = Integer.MAX_VALUE;
            }
        }
        path[0][0] = 0;
        Queue<Integer> q = new ArrayDeque<Integer>();
        q .add(0);
        long [][] mapping = new long[r][c];
        mapping[0][0] = 1;
        while(!q .isEmpty()){
            int temp = q.poll();
            int x = temp / c;
            int y = temp % c;
            int currentLayer = path[x][y];
            if(x-1 >= 0 && map[x-1][y] != 'x'){
                if(path[x - 1][y] == Integer.MAX_VALUE){

                    mapping[x-1][y] = (long) ((mapping[x-1][y] + mapping[x][y]) % (1E9 + 7)) ;
                    q.add(temp - c);
                    path[x-1][y] = currentLayer + 1;
                }
                else if(path[x - 1][y] == currentLayer+1){
                    mapping[x-1][y] = (long) ((mapping[x-1][y] + mapping[x][y]) % (1E9 + 7)) ;
                }
            }
            if(x+1 < r && map[x+1][y] != 'x'){
                if(path[x+1][y] == Integer.MAX_VALUE){

                    mapping[x+1][y] = (long) ((mapping[x+1][y] + mapping[x][y])% (1E9 + 7));
                    q.add(temp + c);
                    path[x + 1][y] = currentLayer + 1;

                }
                else if(path[x+1][y] == currentLayer+1){
                    mapping[x+1][y] = (long) ((mapping[x+1][y] + mapping[x][y])% (1E9 + 7));
                }
            }
            if(y-1 >= 0 && map[x][y-1] != 'x'){
                if(path[x][y-1] == Integer.MAX_VALUE){

                    mapping[x][y-1] = (long) ((mapping[x][y-1] + mapping[x][y]) % (1E9 + 7));
                    q .add(temp - 1);
                    path[x][y-1] = currentLayer + 1;


                }
                else if(path[x][y-1] == currentLayer+1){
                    mapping[x][y-1] = (long) ((mapping[x][y-1] + mapping[x][y]) % (1E9 + 7));

                }
            }
            if(y+1 < c && map[x][y+1] != 'x'){
                if(path[x][y+1] == Integer.MAX_VALUE){

                    mapping[x][y+1] = (long) ((mapping[x][y+1] + mapping[x][y])% (1E9 + 7));
                    q.add(temp + 1);
                    path[x][y+1] = currentLayer + 1;

                }
                else if(path[x][y+1] == currentLayer+1){
                    mapping[x][y+1] = (long) ((mapping[x][y+1] + mapping[x][y])% (1E9 + 7));
                }
            }

        }
        result[0] = mapping[r-1][c-1];

        if(path[r-1][c-1] == Integer.MAX_VALUE){
            result[1] = -1;
        }else{
            result[1] = path[r-1][c-1];
        }
        return result;

    }


    public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        String[] split = in.nextLine().split(" ");
        int M = Integer.parseInt(split[0]);
        int N = Integer.parseInt(split[1]);
        char[][] map = new char[M][N];
        for(int i=0; i<M; i++) {
            map[i] = in.nextLine().toCharArray();
        }
        long[] result = getPath(map);
        for(long c : result)
            System.out.println(c);
        in.close();
    }


}

