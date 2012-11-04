package net.mklew.hotelms.domain.booking.reservation.rates;

import org.joda.money.Money;
import net.mklew.hotelms.domain.room.Room;

/**
 * @author Marek Lewandowski <marek.m.lewandowski@gmail.com>
 * @since 9/27/12
 *        Time: 11:24 AM
 */
public class RackRate extends Rate
{
    public RackRate(Money upchargeExtraPerson, Money standardPrice, Money upchargeExtraBed, Room room)
    {
        super(upchargeExtraPerson, standardPrice, upchargeExtraBed, room);
    }

    @Override
    public String getRateName()
    {
        return "Rack rate";
    }
}
