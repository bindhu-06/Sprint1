package com.cg.entities;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;
@Entity
@Table (name="busoperator")
public class BusOperator {
	private String busOperatorUsername;
	private String passowrd;
	private List<Bus> operationalBuses;
	private List<Integer> caseNumber;
	
	public BusOperator(String busOperatorUsername, String passowrd, List<Bus> operationalBuses,	List<Integer> caseNumber) {
			super();
		this.busOperatorUsername = busOperatorUsername;
		this.passowrd = passowrd;
		this.operationalBuses = operationalBuses;
		this.caseNumber = caseNumber;
	}
	public BusOperator() {
		super();
		// TODO Auto-generated constructor stub
	}
	@OneToMany(mappedBy="BusOperator")
	public String getBusOperatorUsername() {
		return busOperatorUsername;
	}
	public void setBusOperatorUsername(String busOperatorUsername) {
		this.busOperatorUsername = busOperatorUsername;
	}
	public String getPassowrd() {
		return passowrd;
	}
	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}
	public List<Bus> getOperationalBuses() {
		return operationalBuses;
	}
	public void setOperationalBuses(List<Bus> operationalBuses) {
		this.operationalBuses = operationalBuses;
	}
	public List<Integer> getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(List<Integer> caseNumber) {
		this.caseNumber = caseNumber;
	}
	@Override
	public String toString() {
		return "BusOperator [busOperatorUsername=" + busOperatorUsername + ", passowrd=" + passowrd
				+ ", operationalBuses=" + operationalBuses + ", caseNumber=" + caseNumber + "]";
	}
}
