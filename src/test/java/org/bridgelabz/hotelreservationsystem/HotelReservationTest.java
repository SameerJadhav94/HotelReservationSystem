package org.bridgelabz.hotelreservationsystem;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class HotelReservationTest
{
    HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

    @Test
    public void whenAddingHotelShouldReturnTrue()
    {
        boolean valid1 = hotelReservationSystem.addHotel(new Hotel("LakeWood", 110 ));
        Assert.assertTrue(valid1);
        boolean valid2 = hotelReservationSystem.addHotel(new Hotel("BridgeWood", 160 ));
        Assert.assertTrue(valid2);
        boolean valid3 = hotelReservationSystem.addHotel(new Hotel("RidgeWood", 220 ));
        Assert.assertTrue(valid3);

    }

}
