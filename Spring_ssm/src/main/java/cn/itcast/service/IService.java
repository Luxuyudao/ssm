package cn.itcast.service;

import cn.itcast.bean.Haha;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IService {
    /**
     * 查询所有
     */
    public List<Haha> findAll();

    /**
     * 添加账户
     */
    public int add(Haha haha);

    /**
     * 修改内容
     * @param haha
     */
    public int update(Haha haha);

    /**
     * 根据id删除
     * @param id
     */
    public int delHaha(int id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Haha getHahaById(int id);

}
