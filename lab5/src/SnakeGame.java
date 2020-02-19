public class SnakeGame {

    // Elements
    private static boolean[][] Game;
    private static int[] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;

    // Constructors
    SnakeGame(){
        boolean[][] Game = new boolean[1][1];
    }

    SnakeGame(boolean[][] g, int x, int y){
        Game = g;

    }

    // Methods

    public static int[] findTailExhaustive(){
        int exhaustiveChecks = 0;
        int length = 0;
        int neighbor = 0;
        for(int i = 0; i < Game.length; i++){                       // Part of snake? No -> move to next cell, Yes -> check neighbors for other snakes part if there is only 1 neighbor i am either head or tail, if tail return int[], if head continue, alw
            for(int j = 0; i < Game[i].length; j++){
                    if(Game[i][j]){
                        if(Game[i-1][j-1]){ // TOP LEFT
                            neighbor++;
                            length++;
                        }
                        if(Game[i-1][j]){ // TOP
                            neighbor++;
                            length++;
                        }
                        if(Game[i-1][j+1]){ // TOP RIGHT
                            neighbor++;
                            length++;
                        }
                        if(Game[i][j-1]){ // LEFT
                            neighbor++;
                            length++;
                        }
                        if(Game[i][j+1]){ // RIGHT
                            neighbor++;
                            length++;
                        }
                        if(Game[i+1][j-1]){ // BOTTOM LEFT
                            neighbor++;
                            length++;
                        }
                        if(Game[i+1][j]){ // BOTTOM
                            neighbor++;
                            length++;
                        }
                        if(Game[i+1][j+1]){ // BOTTOM RIGHT
                            neighbor++;
                            length++;
                        }

                    }
                    exhaustiveChecks++;
                    if(neighbor == 1 && headPosition[0] != i && headPosition[1] != j){
                        int[] result = {i,j,length};
                        return result;
                    }
            }
        }
        // TODO: Finish Method
        return null;
    }
    public int[] findTailRecursive(){
        // TODO: Finish Method
        return null;
    }
    public static int getExhaustiveChecks() {
        return exhaustiveChecks;
    }

    public static int getRecursiveChecks() {
        return recursiveChecks;
    }

}
