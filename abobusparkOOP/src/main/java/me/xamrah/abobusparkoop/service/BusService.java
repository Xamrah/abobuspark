package me.xamrah.abobusparkoop.service;

import me.xamrah.abobusparkoop.domain.Bus;
import me.xamrah.abobusparkoop.utils.ClientResponse;

public interface BusService {
    public ClientResponse createBus(Bus bus);
    public ClientResponse deleteBus(Long busId);
    public Bus getBus(Long busId);
    public ClientResponse updateBusData(Long busId, Bus newBusData);
}
