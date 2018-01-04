package com.netease.dubbo.test.consumer;

import com.netease.dubbo.test.api.CommonApiService;
import javax.annotation.Resource;

public class CommonApiClient {
    @Resource(name = "commonApiService")
    private CommonApiService commonApiService;

    public int getSquare(int n) {
        return commonApiService.getSquare(n);
    }
}
