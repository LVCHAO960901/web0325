package com.neuedu.util;

import lombok.Data;

@Data
public class Page {
    private Integer pageNo=1;
    private Integer pageSize=10;
    /*
    *   withPage 该值如果为0则不分页  如果为1 则分页
    * */
    private Integer withPage=1;
    public int getPageStart(){
        return (pageNo-1)*pageSize;
    }
}
