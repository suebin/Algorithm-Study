class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        while(true) {
            a = a/2 + a%2;
            b = b/2 + b%2;
            answer++;
            if (a == b) break;
        }

        return answer;
    }
}


/*
정확성  테스트
테스트 1 〉	통과 (0.03ms, 76.9MB)
테스트 2 〉	통과 (0.02ms, 71.8MB)
테스트 3 〉	통과 (0.01ms, 75.7MB)
테스트 4 〉	통과 (0.03ms, 78.4MB)
테스트 5 〉	통과 (0.01ms, 73.8MB)
테스트 6 〉	통과 (0.01ms, 75.5MB)
테스트 7 〉	통과 (0.02ms, 83MB)
테스트 8 〉	통과 (0.02ms, 74.6MB)
테스트 9 〉	통과 (0.03ms, 79MB)
테스트 10 〉	통과 (0.02ms, 68MB)
테스트 11 〉	통과 (0.01ms, 72.7MB)
테스트 12 〉	통과 (0.01ms, 68.7MB)
테스트 13 〉	통과 (0.02ms, 76MB)
테스트 14 〉	통과 (0.01ms, 75.1MB)
테스트 15 〉	통과 (0.02ms, 75.7MB)
테스트 16 〉	통과 (0.01ms, 77.8MB)
테스트 17 〉	통과 (0.02ms, 74.8MB)
테스트 18 〉	통과 (0.03ms, 76.9MB)
테스트 19 〉	통과 (0.02ms, 77MB)
테스트 20 〉	통과 (0.01ms, 71.6MB)
테스트 21 〉	통과 (0.03ms, 78.5MB)
테스트 22 〉	통과 (0.02ms, 72.7MB)
테스트 23 〉	통과 (0.01ms, 78.8MB)
테스트 24 〉	통과 (0.02ms, 74.3MB)
테스트 25 〉	통과 (0.03ms, 90.9MB)
테스트 26 〉	통과 (0.02ms, 67.9MB)
테스트 27 〉	통과 (0.03ms, 81.6MB)
테스트 28 〉	통과 (0.01ms, 76.1MB)
테스트 29 〉	통과 (0.02ms, 77.1MB)
테스트 30 〉	통과 (0.02ms, 74.3MB)
테스트 31 〉	통과 (0.04ms, 69MB)
테스트 32 〉	통과 (0.02ms, 73.1MB)
테스트 33 〉	통과 (0.01ms, 74.9MB)
테스트 34 〉	통과 (0.01ms, 73.8MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
