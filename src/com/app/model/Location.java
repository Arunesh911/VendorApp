package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="loc_tab")
public class Location {
	
	@Id
	@Column(name="loc_id")
	@SequenceGenerator(name="loc_id_generator",sequenceName="loc_id_sequence",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="loc_id_generator")
	private int locId;
	@Column(name="loc_name")
	private String locName;
	@Column(name="loc_type")
	private String locType;
	
	
	public Location(){
		
	}
	public Location(int locId) {
		super();
		this.locId = locId;
	}
		
	
	public int getLocId() {
		return locId;
	}
	public void setLocId(int locId) {
		this.locId = locId;
	}
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	public String getLocType() {
		return locType;
	}
	public void setLocType(String locType) {
		this.locType = locType;
	}
	@Override
	public String toString() {
		return "Location [locId=" + locId + ", locName=" + locName + ", locType=" + locType + "]";
	}

}
