class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        int st = intervals[0][0];
        int ed = intervals[0][1];
        List<int[]> ans = new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            
            if(intervals[i][0]<=ed){
                ed = Math.max(intervals[i][1],ed);
                continue;
            }
            else{
                ans.add(new int[]{st,ed});
                st = intervals[i][0];
                ed = intervals[i][1];
            }
        }
        ans.add(new int[]{st,ed});
        return ans.toArray(new int[ans.size()][]);
    }
}


