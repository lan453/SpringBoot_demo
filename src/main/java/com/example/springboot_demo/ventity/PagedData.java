package com.example.springboot_demo.ventity;

import java.util.ArrayList;
import java.util.List;

public class PagedData{

    private long total;

    private List<Object> rows = new ArrayList<>();

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<Object> getRows() {
        return rows;
    }

    public void setRows(List<Object> rows) {
        this.rows = rows;
    }
}
