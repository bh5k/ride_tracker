package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Ride;

@Repository("rideRepository")
public class RideRepositoryImpl implements RideRepository {

	@Override
	public List<Ride> getRides() {
		Ride ride = new Ride();
		ride.setName("Corner Canyon");
		ride.setDuration(120);
		List <Ride> rides = new ArrayList<>();
		rides.add(ride);
		return rides;
	}
	
}
