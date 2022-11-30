package me.xamrah.abobusparkoop.service;

import me.xamrah.abobusparkoop.domain.Shift;
import me.xamrah.abobusparkoop.utils.ClientResponse;
import org.springframework.stereotype.Service;

@Service
public class ShiftServiceImpl implements ShiftService{
    @Override
    public ClientResponse createShift(Shift shift) {
        return ClientResponse.OK;
    }

    @Override
    public ClientResponse deleteShift(Long shiftId) {
        return ClientResponse.OK;
    }

    @Override
    public Shift getShift(Long shiftId) {
        return null;
    }

    @Override
    public ClientResponse openShift(Long shiftId) {
        return ClientResponse.OK;
    }

    @Override
    public ClientResponse closeShift(Long shiftId) {
        return ClientResponse.OK;
    }

    @Override
    public ClientResponse updateShiftData(Long shiftId, Shift newShiftData) {
        return ClientResponse.OK;
    }
}
