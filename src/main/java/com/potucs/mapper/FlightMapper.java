package com.potucs.mapper;


import com.potucs.condition.FlightCondition;
import com.potucs.domain.Flight;
import org.apache.ibatis.session.ResultHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther wangzekun
 * @Date 2021/7/27 09:51
 * @Description
 */

public interface FlightMapper {

    List<Flight> findFlightsByCondition(FlightCondition condition);

    void findFlightsForHandlerByCondition(ResultHandler<Flight> resultHandler);

}

