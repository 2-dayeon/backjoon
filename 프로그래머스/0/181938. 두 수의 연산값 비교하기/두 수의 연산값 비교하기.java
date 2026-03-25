class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int n1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int n2 = 2 * a * b;
        if (n1 >= n2) answer += n1;
        else answer += n2;
        return answer;
    }
}