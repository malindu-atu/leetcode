class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> answer = new ArrayList<>();
        int stream = 1;

        for(int nums:target){
            while(stream < nums){
                answer.add("Push");
                answer.add("Pop");
                stream++;
            }

            answer.add("Push");
            stream++;
        }
        return answer;
    }
}