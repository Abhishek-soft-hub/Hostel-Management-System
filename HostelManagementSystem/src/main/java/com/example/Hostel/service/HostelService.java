package com.example.Hostel.service;

import java.util.List;

import com.example.Hostel.entity.Hostel;

public interface HostelService {
	
	public void saveHostel(Hostel hostel);
	public void deleteHOstel(int id);
	public Hostel getHostel(int id);
	public List<Hostel> getHostels();
	public void updateHostel(int id );

}
