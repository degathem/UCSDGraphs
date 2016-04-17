package roadgraph;

import geography.GeographicPoint;

public class RoadEdge {
	private GeographicPoint to;
	private String roadName;
	private String roadType;
	private double length;
	
	public void setRoadName(String roadName){
		this.roadName = roadName;
	}
	
	public void setRoadType(String roadType){
		this.roadType = roadType;
	}
	
	public void setLength(double length){
		this.length = length;
	}
	
	public String getRoadName(){
		return roadName;
	}
	
	public String getRoadType(){
		return this.roadType;
	}
	
	public double getRoadLength(){
		return this.length;
	}
	
	public GeographicPoint GeographicPoint() {
		return null;
	}
}
