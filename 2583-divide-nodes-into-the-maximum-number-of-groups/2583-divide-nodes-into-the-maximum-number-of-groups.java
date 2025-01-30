class Solution {
    
    List<List<Integer>> graph;
    int n; 
    Map<Integer, List<Integer>> components;
    int component;
    
    public int magnificentSets(int n, int[][] edges) {
        this.n = n;
        this.graph = new ArrayList();
        for(int i = 0; i <= n; i++)
            graph.add(new ArrayList());
        for(int[] edge : edges)
        {
            int a = edge[0];
            int b = edge[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        this.component = 0;
        this.components = new HashMap();
        boolean[] visited = new boolean[n+1]; 
        for(int i = 1; i <= n; i++)
        {
            components.put(component, new ArrayList());
            constructComponents(i, visited);
            component++;
        }
        for(int key : components.keySet())
        {
            for(int node : components.get(key))
            {
                boolean bipartite = isBipartite(node);
                if(!bipartite)
                    return -1;
            }
        }
        int[] componentsMaxPathPossible = new int[n+1];
        for(int key : components.keySet())
        {
            for(int node : components.get(key))
            {
                int dist = bfs(node);
                componentsMaxPathPossible[key] = Math.max(componentsMaxPathPossible[key], dist);
            }
        }
        
        int totalGroups = 0;
        for(int i = 0; i <= n; i++)
        {
            totalGroups += componentsMaxPathPossible[i];
        }
        return totalGroups;
    }
    
    public boolean isBipartite(int node)
    {
        int[] color = new int[n+1];
        boolean[] visited = new boolean[n+1];
        Queue<Integer> queue = new LinkedList();
        queue.add(node);
        visited[node] = true;
        color[node] = 1;
        while(!queue.isEmpty())
        {
            int currNode = queue.poll();
            for(int neigh : graph.get(currNode))
            {
                if(!visited[neigh] && color[neigh] != color[currNode])
                {
                    visited[neigh] = true;
                    color[neigh] = 3 - color[currNode];
                    queue.add(neigh);
                }
                if(color[neigh] == color[currNode])
                    return false;
            }
        }
        return true;
    }
    
    public int bfs(int node)
    {
        boolean[] visited = new boolean[n+1];
        Queue<Integer> queue = new LinkedList();
        queue.add(node);
        visited[node] = true;
        int level = 0;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i = 0; i < size; i++)
            {
                int currNode = queue.poll();
                for(int neigh : graph.get(currNode))
                {
                    if(!visited[neigh])
                    {
                        visited[neigh] = true;;
                        queue.add(neigh);
                    }
                }
            }
            level++;
        }
        return level;
    }
    
    public void constructComponents(int node, boolean[] visited)
    {
        if(visited[node])
            return;
        components.get(component).add(node);
        visited[node] = true;
        for(int neigh : graph.get(node))
        {
            if(!visited[neigh])
            {
                constructComponents(neigh, visited);
            }
        }
    }
}