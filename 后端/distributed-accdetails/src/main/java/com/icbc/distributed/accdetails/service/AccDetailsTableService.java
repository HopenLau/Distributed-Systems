package com.icbc.distributed.accdetails.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.icbc.common.utils.PageUtils;
import com.icbc.distributed.accdetails.entity.AccDetailsTableEntity;

import java.util.Map;

/**
 * 
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-07-20 20:19:53
 */
public interface AccDetailsTableService extends IService<AccDetailsTableEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

