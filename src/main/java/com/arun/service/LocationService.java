package com.arun.service;

import org.springframework.beans.factory.parsing.Location;

import java.util.List;
import java.util.Optional;

/**
 * Created by Adwiti on 5/10/2018.
 */
public interface LocationService {
    Location saveLocation(Location location);

    Location updateLocation(Location location);

    void deleteLocation(Location location);

    Optional<Location> getLocationById(int id);

    List<Location> getLocations();
}
