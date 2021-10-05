class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> a=new ArrayList<>();
        int minc=0;
        int maxc=matrix[0].length-1;
        int minr=0;
        int maxr=matrix.length-1;
        int ct=1;
        int to=(matrix.length )*(matrix[0].length);
        while(ct<=to){
        //Right
        for(int i=minc;i<=maxc && ct<=to;i++){
            a.add(matrix[minr][i]);
            ct++;
        }
        minr++;
        
        //Bottom
         for(int i=minr;i<=maxr && ct<=to;i++){
            a.add(matrix[i][maxc]);
             ct++;
        }
        maxc--;
        
        //Left--> columns r changing but rowas r constsnt
         for(int i=maxc;i>=minc && ct<=to;i--){
            a.add(matrix[maxr][i]);
             ct++;
        }
        maxr--;
        
        
        //Upwards--> col const / row varies
         for(int i=maxr;i>=minr && ct<=to;i--){
            a.add(matrix[i][minc]);
             ct++;
        }
        minc++;
        }
        return a;
    }
}