package cn.itcast.service.impl;

import cn.itcast.bean.Haha;
import cn.itcast.dao.HahaDao;
import cn.itcast.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("service")
public class Serviceipml implements IService {
    @Autowired
    private HahaDao hahaDao;
    @Override
    public List<Haha> findAll() {
        System.out.println("开始查询所有咯");
        return hahaDao.findAll();
    }

    @Override
    public int add(Haha haha) {
        System.out.println("开始添加咯");
        return hahaDao.add(haha);
    }

    @Override
    public int update(Haha haha) {
        System.out.println( "开始修改咯");
        return hahaDao.update(haha);
    }

    @Override
    public int delHaha(int id) {
       return hahaDao.delHaha(id);
    }

    @Override
    public Haha getHahaById(int id) {
        return hahaDao.getHahaById(id);
    }
}
