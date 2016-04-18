package roadgraph;

import geography.GeographicPoint;

public class RoadEdge {
	private GeographicPoint destinationPoint;
	private String roadName;
	private String roadType;
	private double length;
	
	public RoadEdge(GeographicPoint destinationPoint, String roadName, String roadType, double length){
		this.destinationPoint = destinationPoint;
		this.roadName = roadName;
		this.roadType = roadType;
		this.length = length;
	}
	
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
	
	public void setDestinationPoint(GeographicPoint destinationPoint) {
		this.destinationPoint = destinationPoint;
	}
	
	public GeographicPoint getDestinationPoint(){
		return destinationPoint;
	}
}
