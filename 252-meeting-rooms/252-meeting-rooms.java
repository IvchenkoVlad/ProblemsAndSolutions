class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> (a[1] - b[1]));
        for(int [] intr : intervals)
        System.out.println(Arrays.toString(intr));
        for(int i = 0; i < intervals.length-1; i++){
            if(intervals[i][1] > intervals[i+1][0]){
                return false;
            }
        }
        return true;
    }
}