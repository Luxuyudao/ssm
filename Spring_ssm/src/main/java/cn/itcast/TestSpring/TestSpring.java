package cn.itcast.TestSpring;

import cn.itcast.service.IService;
import cn.itcast.service.impl.Serviceipml;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void ccc(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring-config.xml");
        IService bean = ac.getBean("service", IService.class);
        bean.findAll();
    }
}
