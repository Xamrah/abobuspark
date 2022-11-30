package me.xamrah.abobusparkoop.service;

import me.xamrah.abobusparkoop.domain.Shift;
import me.xamrah.abobusparkoop.utils.ClientResponse;

public interface ShiftService {
    public ClientResponse createShift(Shift shift);
    public ClientResponse deleteShift(Long shiftId);
    public Shift getShift(Long shiftId);
    public ClientResponse openShift(Long shiftId);
    public ClientResponse closeShift(Long shiftId);
    public ClientResponse updateShiftData(Long shiftId, Shift newShiftData);
}
