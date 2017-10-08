/*
Sample input

2
4 4
1 2
1 3
2 3
1 4
1 2 3
4 4
1 2
1 3
2 3
1 4
2 3 4


Sample Output
 
 NO 
 YES

*/
 

import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        

     
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int flag = 0;
        for (int j = 0; j < N; j++) {
            int n = s.nextInt();
            int m = s.nextInt();
        
            int[] ar = new int[n+1];
            int[] e = new int[2*m+1];
              
            for(int i = 1 ; i <= 2*m ; i++){
                e[i] = s.nextInt();
            }
              
            for(int i = 0 ; i < n-1 ; i++){
                int z  = s.nextInt();
                int x = e[z*2];
                int y = e[z*2 -1];
                ar[x] = 1;
                ar[y] = 1;
            }
            
            for(int i = 1 ; i <= n ; i++){
                if(ar[i] == 0){
                    flag = 0;
                    break;
                }
                else
                    flag = 1;
                
            }
            if(flag == 0)
                System.out.println("NO");
            else
                System.out.println("YES");
            
        }
        
    }
}
