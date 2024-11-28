public class EXPERIm  {
    public static int Bridge(int[][] grid) {
        int k=0,c=0,r=0;
        int FIR[] = new int[2];
        int SEC[] = new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
            if (grid[i][j] == 1){
                if(k==0){
                FIR[0] = i;
                FIR[1] = j;
                k++;
            }if((k==1)&&(grid[i][j]==1)){
                SEC[0] = i;
                SEC[1] = j; 
        }
    }
}}
r = Math.abs(FIR[0]-SEC[0]);
c = Math.abs(FIR[1]-SEC[1]);
return (c+r-1); 
}
public static void main(String[] args) {
    int[][] grid ={ { 1, 0, 0,0 }, { 0, 0, 0,0 },{0,0,0,1} };
    System.out.println(Bridge(grid));
}
}