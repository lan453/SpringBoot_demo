package com.example.springboot_demo.ventity;

import java.util.ArrayList;
import java.util.List;

public class PageDataClass<E>{

    private long total;

    private List<E> rows = new ArrayList<>();

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<E> getRows() {
        return rows;
    }

    public void setRows(List<E> rows) {
        this.rows = rows;
    }
}

