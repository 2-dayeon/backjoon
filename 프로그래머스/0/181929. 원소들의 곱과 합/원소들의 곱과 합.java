class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int g = 1;
        int h = 0;
        for (int i = 0; i < num_list.length; i++) {
            g *= num_list[i];
            h += num_list[i];
        }
        if (g < (h*h)) answer = 1;
        return answer;
    }
}