class Solution {
    public int compareVersion(String version1, String version2) {
        
        List<Integer> v1 = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();
        for(String part: version1.split("\\.")){
            v1.add(Integer.parseInt(part));
        }
        for(String part: version2.split("\\.")){
            v2.add(Integer.parseInt(part));
        }
        int peak = Math.min(v1.size(), v2.size());
        for(int i = 0; i < peak; i++){
            if(v1.get(i) > v2.get(i)){
                return 1;
            }
            else if(v1.get(i) < v2.get(i)){
                return -1;
            }
        }
        if(v1.size()-peak==0){
            for(int i = peak; i < v2.size(); i++){
                if(v2.get(i) > 0){
                    return -1;
                }
            }
        }else{
            for(int i = peak; i < v1.size(); i++){
                if(v1.get(i) > 0){
                    return 1;
                }
            }
        }
        return 0;
    }
}