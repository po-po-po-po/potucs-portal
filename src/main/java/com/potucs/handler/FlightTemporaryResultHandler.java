package com.potucs.handler;

import com.potucs.domain.Flight;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * @Auther wangzekun
 * @Date 2021/7/27 17:06
 * @Description
 */
@Slf4j
@Component
public class FlightTemporaryResultHandler implements ResultHandler<Flight> {

    @Override
    public void handleResult(ResultContext<? extends Flight> resultContext) {
        Flight flight = resultContext.getResultObject();
        log.info("---------------查询数据开始每次返回单条结果。。。。"+flight);
    }

}
