class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List<Integer> li = new ArrayList<Integer>();
        
        int i=0;
        int j=0;
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                li.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        
        int[] answer = new int[li.size()];
        for(int k=0; k<answer.length; k++){
            answer[k] = li.get(k);
        }
        return answer;
    }
}