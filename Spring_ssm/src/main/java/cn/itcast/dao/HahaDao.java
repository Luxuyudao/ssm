package cn.itcast.dao;

import cn.itcast.bean.Haha;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface HahaDao {
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

    public Haha getHahaById(int id);
}
