class Solution {
    public boolean judgeCircle(String moves) {
        String[] move = moves.split("");
        int[] toWalk = {0,0};
        
        for(String m : move){
            if(m.equals("U")) toWalk[0] += 1;
            else if(m.equals("D")) toWalk[0] -= 1;
            else if(m.equals("L")) toWalk[1] += 1;
            else toWalk[1] -= 1;
        }
        
        if(toWalk[0] == 0 && toWalk[1] == 0){
            return true;
        }
        else{
            return false;
        }
    }
}