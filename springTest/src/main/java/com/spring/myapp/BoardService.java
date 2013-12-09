package com.spring.myapp;

import java.util.Map;

public interface BoardService 
{
    public void list(Map map);

    public void insert(Board board);

    Board select(String seq);

    public void delete(String seq);

    public void update(Board board);
}
