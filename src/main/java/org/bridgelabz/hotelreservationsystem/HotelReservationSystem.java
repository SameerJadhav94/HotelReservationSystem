package org.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    List<Hotel> hotels = new ArrayList<>();

    /***
     * method for adding hotel
     * @param hotel
     * @return
     */
    public boolean addHotel(Hotel hotel){
        return hotels.add(hotel);
    }

    public static void main(String[] args) {
        //Object creation
        HotelReservationSystem hotel = new HotelReservationSystem();
        //default value
        hotel.addHotel(null);
    }
}
