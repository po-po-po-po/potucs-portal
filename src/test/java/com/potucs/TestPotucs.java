package com.potucs;

import com.potucs.condition.FlightCondition;
import com.potucs.domain.Flight;
import com.potucs.mapper.FlightMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Auther wangzekun
 * @Date 2021/7/27 10:26
 * @Description
 */

@SpringBootTest(classes={PotucsApplication.class})// 指定启动类
@RunWith(SpringRunner.class)
@Slf4j
public class TestPotucs {

    @Autowired
    FlightMapper flightMapper;

    @Test
    public void testFLight()  {
        List<Flight> flightList=flightMapper.findFlightsByCondition(new FlightCondition());
        System.out.println(flightList);
    }

}
