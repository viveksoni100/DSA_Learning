package graphs.list.representation;

import java.util.ArrayList;

public class GraphMain {

    public static void main(String[] args) {

        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));
        Graph graph = new Graph(nodeList);
        graph.addUndirectedEdge(0,1);
        graph.addUndirectedEdge(0,2);
        graph.addUndirectedEdge(0,3);
        graph.addUndirectedEdge(1,4);
        graph.addUndirectedEdge(2,3);
        graph.addUndirectedEdge(3,4);
        //System.out.println(graph.toString());
        // graph.bfs();

        // topological sort
        ArrayList<GraphNode> topologicalNodes = new ArrayList<>();
        topologicalNodes.add(new GraphNode("A", 0));
        topologicalNodes.add(new GraphNode("B", 1));
        topologicalNodes.add(new GraphNode("C", 2));
        topologicalNodes.add(new GraphNode("D", 3));
        topologicalNodes.add(new GraphNode("E", 4));
        topologicalNodes.add(new GraphNode("F", 5));
        topologicalNodes.add(new GraphNode("G", 6));
        topologicalNodes.add(new GraphNode("H", 7));
        Graph topologyGraph = new Graph(topologicalNodes);
        topologyGraph.addDirectedEdge(0, 2);
        topologyGraph.addDirectedEdge(2, 4);
        topologyGraph.addDirectedEdge(4, 7);
        topologyGraph.addDirectedEdge(4, 5);
        topologyGraph.addDirectedEdge(5, 6);
        topologyGraph.addDirectedEdge(1, 2);
        topologyGraph.addDirectedEdge(1, 3);
        topologyGraph.addDirectedEdge(3, 5);
        //System.out.println(topologyGraph.toString());
        //topologyGraph.topologicalSort();

        //single source shortest path problem
        ArrayList<GraphNode> sssppNodeList = new ArrayList<>();
        sssppNodeList.add(new GraphNode("A", 0));
        sssppNodeList.add(new GraphNode("B", 1));
        sssppNodeList.add(new GraphNode("C", 2));
        sssppNodeList.add(new GraphNode("D", 3));
        sssppNodeList.add(new GraphNode("E", 4));
        sssppNodeList.add(new GraphNode("F", 5));
        sssppNodeList.add(new GraphNode("G", 5));
        Graph sssppGraph = new Graph(sssppNodeList);
        sssppGraph.addUndirectedEdge(0,1);
        sssppGraph.addUndirectedEdge(0,2);
        sssppGraph.addUndirectedEdge(1,3);
        sssppGraph.addUndirectedEdge(1,6);
        sssppGraph.addUndirectedEdge(2,3);
        sssppGraph.addUndirectedEdge(2,4);
        sssppGraph.addUndirectedEdge(3,5);
        sssppGraph.addUndirectedEdge(4,5);
        sssppGraph.addUndirectedEdge(5,6);
        sssppGraph.BFSForSSSPP(sssppNodeList.get(0));
    }
}
