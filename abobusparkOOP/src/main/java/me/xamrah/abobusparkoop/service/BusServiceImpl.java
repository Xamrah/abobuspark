package me.xamrah.abobusparkoop.service;

import me.xamrah.abobusparkoop.domain.Bus;
import me.xamrah.abobusparkoop.utils.ClientResponse;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl implements BusService {
    @Override
    public ClientResponse createBus(Bus bus) {

        return null;
    }

    @Override
    public ClientResponse deleteBus(Long busId) {
        return null;
    }

    @Override
    public Bus getBus(Long busId) {
        return null;
    }

    @Override
    public ClientResponse updateBusData(Long busId, Bus newBusData) {
        return null;
    }
}
