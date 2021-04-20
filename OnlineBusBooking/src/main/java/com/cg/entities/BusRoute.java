package com.cg.entities;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table (name="busroute")
public class BusRoute {

	private String routeName ;
	private String source;
	private String destination;
	public BusRoute(String routeName, String source, String destination) {
		super();
		this.routeName = routeName;
		this.source = source;
		this.destination = destination;
	}
	public BusRoute() {
		super();
		// TODO Auto-generated constructor stub
	}
	@OneToOne
	private Bus bus;
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "BusRoute [routeName=" + routeName + ", source=" + source + ", destination=" + destination + "]";
	}
}
