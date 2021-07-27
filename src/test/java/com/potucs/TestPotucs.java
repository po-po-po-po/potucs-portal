package com.potucs;

import com.potucs.condition.FlightCondition;
import com.potucs.domain.Flight;
import com.potucs.handler.FlightTemporaryResultHandler;
import com.potucs.mapper.FlightMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    FlightTemporaryResultHandler flightTemporaryResultHandler;

    /**
     * 测试连接mybatis查询数据库
     */
    @Test
    public void testFLight()  {
        List<Flight> flightList=flightMapper.findFlightsByCondition(new FlightCondition());
        for (Flight flight : flightList) {
            log.info(flight.toString());
        }
    }

    @Test
    public void testHandler()  {
        Map<String, Integer> params = new HashMap<String, Integer>();
        params.put("pageStart", 1);
        params.put("pageEnd", 10);
        sqlSessionTemplate.select("com.potucs.mapper.FlightMapper.findFlightsForHandlerByCondition", flightTemporaryResultHandler);

    }



}
