class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < food.length; i++) {
            for(int j = 1; j <= food[i] / 2; j++) {
                sb.append(i);
            }
        }
        
        return sb + "0" + new StringBuilder(sb).reverse();
    }
}