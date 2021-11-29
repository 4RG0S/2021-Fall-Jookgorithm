import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold_5_1916 {

	static List<PriorityQueue<bus>> list;
	static int dist[];

	static class bus implements Comparable<bus>{
		int to, cost;
		public bus(int to, int cost)
		{
			this.to = to;
			this.cost = cost;
		}
		@Override
		public int compareTo(bus o) {
			return this.cost - o.cost;
		}
	}

	static void dijkstra(int from, int to)
	{
		PriorityQueue<bus> q = new PriorityQueue<>();
		q.add(new bus(from, 0));
		dist[from] = 0;
		while(!q.isEmpty())
		{
			bus temp = q.poll();
      System.out.println(temp.cost);
      for (bus iter : list.get(temp.to)) {
        int cost = temp.cost + iter.cost;
        int dest = iter.to;
        if(dist[dest] == -1 || dist[dest] > cost)
				{
					dist[dest] = cost;
					q.add(new bus(dest, cost));
				}
      }
		}
		System.out.println(dist[to]);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		list = new ArrayList<>();
		for(int i=0;i<N + 1;i++)
		{
			list.add(new PriorityQueue<>());
		}
		for(int i=0;i<M;i++)
		{
			StringTokenizer line = new StringTokenizer(br.readLine(), " ");
			list.get(Integer.parseInt(line.nextToken())).add(new bus(Integer.parseInt(line.nextToken()), Integer.parseInt(line.nextToken())));
		}
		StringTokenizer line = new StringTokenizer(br.readLine(), " ");
		dist = new int[N + 1];
		for(int i=0;i<N+1;i++)
		{
			dist[i] =  -1;
		}
		dijkstra(Integer.parseInt(line.nextToken()), Integer.parseInt(line.nextToken()));

	}

}
