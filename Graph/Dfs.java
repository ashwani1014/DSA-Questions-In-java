package Graph;
import java.util.*;

public class Dfs {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
         
        //Number of Vertices
        System.out.println("Enter the number of vertices ");
        int V=sc.nextInt();

        //Number of Edges
        System.out.println("Enter the number of Edges ");
        int E=sc.nextInt();

        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter edges (u v):");
       

        for(int i=0;i<E;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        bfs(adj,V);
        sc.close();
    }

    static void bfs(ArrayList<ArrayList<Integer>> adj,int V){

        boolean visited []=new boolean[V];

        Queue<Integer> q=new LinkedList<>();

        visited[0]=true;

        q.offer(0);

        while(!q.isEmpty()){
            int node=q.poll();

            System.out.print(node + " ");

            for(int neighbour : adj.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    q.offer(neighbour);
                }
            }
        }
        
    }
}
