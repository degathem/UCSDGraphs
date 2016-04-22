package roadgraph;
import geography.GeographicPoint;
import java.util.ArrayList;

public class IntersectionNode {
	
	private GeographicPoint location;
	private ArrayList<RoadEdge> roadEdgeList;
	
	
	public IntersectionNode(GeographicPoint location){
		this.location = location;
		this.roadEdgeList = new ArrayList<RoadEdge>();
	}
	
	public void setLocation(GeographicPoint location){
		this.location = location;
	}
	
	public GeographicPoint getLocation() {
		return this.location;
	}
	
	public ArrayList<RoadEdge> getRoadEdgeList(){
		return this.roadEdgeList;
	}
	
	public void addRoadEdge(RoadEdge newRoadEdge){
		roadEdgeList.add(newRoadEdge);
	}
}
