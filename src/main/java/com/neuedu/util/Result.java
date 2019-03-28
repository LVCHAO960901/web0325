package com.neuedu.util;

import lombok.Data;

import java.util.List;



public class Result {
    private List<?> list;
    private Integer pageNo;
    private Integer count;
    private Integer maxSize;

    public Result(List<?> list, Integer pageNo, Integer count, Integer pageSize) {
        this.list = list;
        this.pageNo = pageNo;
        this.count = count;
        this.maxSize=count%pageSize>0?(count/pageSize+1):(count/pageSize);
    }

    public List<?> getList() {
        return list;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getMaxSize() {
        return maxSize;
    }
}
