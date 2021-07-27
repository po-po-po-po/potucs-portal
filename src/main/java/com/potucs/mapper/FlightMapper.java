package com.potucs.mapper;


import com.potucs.condition.FlightCondition;
import com.potucs.domain.Flight;

import java.util.List;

/**
 * @Auther wangzekun
 * @Date 2021/7/27 09:51
 * @Description
 */

public interface FlightMapper {

    List<Flight> findFlightsByCondition(FlightCondition condition);

}

