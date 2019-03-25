package com.whz.edu.mapper.base;

public interface BaseMapper <T> {
    /**
     * 查
     * @param id
     * @return
     */
    public T findById(Integer id);
    public T findByUUID(String uuid);

    /**
     * 删
     * @param id
     */
    public void deleteById(Integer id);
    public void deleteByUUID(String uuid);

    /**
     * 改
     * @param t
     */
    public void update(T t);

    /**
     * 增
     * @param t
     */
    public void insert(T t);
}

