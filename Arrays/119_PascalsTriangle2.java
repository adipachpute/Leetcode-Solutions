class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> row = new ArrayList<>();
        long num = 1;  // using long to prevent overflow in high row indices
            
        for(int j = 0; j <= rowIndex; j++){
            row.add((int)num);
            num = (num*(rowIndex-j))/(j+1);
        }
        return row;
    }
}