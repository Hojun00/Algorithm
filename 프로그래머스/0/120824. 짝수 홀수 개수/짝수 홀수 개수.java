class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int n = 0;
        int m = 0;
        
        for (int i : num_list) {
            if (i % 2 == 0) {
                n++;
            } else {
                m++;
            }
        }
        answer[0] = n;
        answer[1] = m;
        return answer;
    }
}