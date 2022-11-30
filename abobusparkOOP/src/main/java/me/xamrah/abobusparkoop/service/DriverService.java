package me.xamrah.abobusparkoop.service;

import me.xamrah.abobusparkoop.domain.Driver;
import me.xamrah.abobusparkoop.utils.ClientResponse;

public interface DriverService {
    public ClientResponse createDriver(Driver driver);
    public ClientResponse deleteDriver(Long driverId);
    public Driver getDriver(Long driverId);
    public ClientResponse updateDriverData(Long driverId, Driver newDriverData);
}
