package com.chenshinan.sagamonitor.saga.mapper;

import com.chenshinan.sagamonitor.saga.domain.SagaTaskInstance;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author shinan.chen
 * @date 2018/11/27
 */
@Component
public interface SagaTaskInstanceMapper extends Mapper<SagaTaskInstance> {
}
