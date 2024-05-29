class Solution {
    public int calPoints(String[] operations){
        ArrayList<Integer> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("+")){
                if(al.size() >= 2){
                    al.add(al.get(al.size()-1) + al.get(al.size()-2));
                }
            }
            else if(operations[i].equals("D")){
                al.add(al.get(al.size()-1) * 2);
            }
            else if(operations[i].equals("C")){
                al.remove(al.get(al.size()-1));
            }
            else{
                al.add(Integer.parseInt(operations[i]));
            }
        }
        
        for(int i=0; i<al.size(); i++){
            sum += al.get(i);
        }
        return sum;
    }
}