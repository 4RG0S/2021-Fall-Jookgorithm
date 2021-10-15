import java.util.*;

public class b_21_10_15_1260 {
    private int V;
    private LinkedList<Integer> list[];
    b_21_10_15_1260(int v){
        V = v;
        list = new LinkedList[v+1];
        for (int i = 0; i < v+1; i++){
        list[i] = new LinkedList();
        }
    }
    void addEdge(int v, int w){
        list[v].add(w);
    }
    void DFS(int v){
        boolean[] visited = new boolean[V+1];
        for (int i = 0; i < V+1; i++){
            visited[i] = false;
            Collections.sort(list[i]);
        }
        DFSUTIL(v, visited);
    }
    void DFSUTIL (int v, boolean[] visited){
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> iter = list[v].iterator();
        while(iter.hasNext()){
            int n = iter.next();
            if (!visited[n]){
                DFSUTIL(n, visited);
            }
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        b_21_10_15_1260 cla = new b_21_10_15_1260(a);
        for (int i = 0; i < b; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            cla.addEdge(p, q);
            cla.addEdge(q, p);
        }
        cla.DFS(c);

        boolean[] visited = new boolean [a+1];
        LinkedList<Integer> list = new LinkedList<Integer>();

        visited[c] = true;
        list.add(c);
        int s = c;
        System.out.println();
        while (list.size() != 0){
            s = list.poll();
            System.out.print(s + " ");
            Iterator<Integer> itr = cla.list[s].listIterator();
            while(itr.hasNext()){
                int n = itr.next();

                if (!visited[n]){
                    visited[n] = true;
                    list.add(n);
                }
            }
        }
    }
}
