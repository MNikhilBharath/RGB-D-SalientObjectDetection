class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lSum=0;
        int n=cardPoints.length;
        for(int i=0; i<k; i++){
            lSum+=cardPoints[i];
        }
        int rSum=0;
        int max=lSum;
        for(int j=0; j<k; j++){
            rSum += cardPoints[n-j-1];
            lSum -= cardPoints[k-j-1];
            max = Math.max(max, lSum+rSum);
        }
        return max;
    }
}