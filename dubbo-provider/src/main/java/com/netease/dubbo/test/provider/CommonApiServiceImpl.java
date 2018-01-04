package com.netease.dubbo.test.provider;

import com.netease.dubbo.test.api.CommonApiService;

public class CommonApiServiceImpl implements CommonApiService {
    public int getSquare(int n) {
        return n*n;
    }
}
