import java.util.Scanner;
public class OptimalApproach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] costs = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                costs[i][j] = sc.nextInt();
            }
        }
        
        System.out.println(minCostII(costs));
        sc.close();
    }
   
    public static int minCostII(int[][] costs) {
        if (costs == null || costs.length == 0) {
            return 0;
        }

        int n = costs.length;
        int k = costs[0].length;

        int prevMin1Cost = 0;
        int prevMin2Cost = 0;
        int prevMin1Color = -1;

        for (int i = 0; i < n; i++) { 
            int currentMin1Cost = Integer.MAX_VALUE;
            int currentMin2Cost = Integer.MAX_VALUE;
            int currentMin1Color = -1;

            for (int j = 0; j < k; j++) { 
                int cost = costs[i][j];
                if (j == prevMin1Color) {
                    cost += prevMin2Cost;
                } else {
                    cost += prevMin1Cost;
                }
                
                if (cost < currentMin1Cost) {
                    currentMin2Cost = currentMin1Cost;
                    currentMin1Cost = cost;
                    currentMin1Color = j;
                } else if (cost < currentMin2Cost) {
                    currentMin2Cost = cost;
                }
            }
            
            prevMin1Cost = currentMin1Cost;
            prevMin2Cost = currentMin2Cost;
            prevMin1Color = currentMin1Color;
        }

        return prevMin1Cost;
    }
}
