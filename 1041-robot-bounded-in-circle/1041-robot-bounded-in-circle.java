class Position{
    int x;
    int y;
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public boolean isRobotBounded(String instructions) {
        int[] check = new int[4];
        Position position = new Position(0,0);

        String[] moves = instructions.split("");
        int direction = 0;

        for(String move : moves){
            if(move.equals("L")){
                direction = (direction + 3) % 4;
                continue;
            }
            if(move.equals("R")){
                direction = (direction + 1) % 4;
                continue;
            }
            position.x += dx[direction];
            position.y += dy[direction];
        }
        return (position.x==0 && position.y==0) || direction != 0;
    }
}