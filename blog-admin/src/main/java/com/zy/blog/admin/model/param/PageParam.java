package com.zy.blog.admin.model.param;


import lombok.Data;

@Data
public class PageParam {
    private Integer currentPage;

    private Integer pageSize;

    private String queryString;
}
