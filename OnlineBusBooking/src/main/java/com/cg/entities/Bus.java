package com.cg.entities;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table (name="bus")
public class Bus {
	private String busNumber;
	private BusRoute busRoute;
	private int totalSeats;
	private int fare;
	
	public Bus(String busNumber, int totalSeats, int fare,BusRoute busRoute) {
		super();
		this.busNumber = busNumber;
		this.totalSeats = totalSeats;
		this.fare = fare;
		this.busRoute=busRoute;
	}
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@OneToOne(mappedBy="bus")	

	private BusOperatorRequest busoperatorrequest;
	
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", totalSeats=" + totalSeats + ", fare=" + fare + "]";
	}
	public BusRoute getBusRoute() {
		return busRoute;
	}
	public void setBusRoute(BusRoute busRoute) {
		this.busRoute = busRoute;
	}
	
}
