package me.xamrah.abobusparkoop.service;

import me.xamrah.abobusparkoop.domain.Driver;
import me.xamrah.abobusparkoop.utils.ClientResponse;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService{
    @Override
    public ClientResponse createDriver(Driver driver) {
        return null;
    }

    @Override
    public ClientResponse deleteDriver(Long driverId) {
        return null;
    }

    @Override
    public Driver getDriver(Long driverId) {
        return null;
    }

    @Override
    public ClientResponse updateDriverData(Long driverId, Driver newDriverData) {
        return null;
    }
}
