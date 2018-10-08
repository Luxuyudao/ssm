package cn.itcast.controller;

import cn.itcast.bean.Haha;
import cn.itcast.service.IService;
import cn.itcast.service.impl.Serviceipml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/controller")
public class HahaController {
    @Autowired
    private IService service;

    @RequestMapping("/findAll")
    public String findAll(HttpServletRequest request){
        List<Haha> list = service.findAll();
        for (Haha haha : list) {
            System.out.println(haha);
        }
        request.setAttribute("halist",list);
        return "list";
    }
    @RequestMapping("/addHaha")
    public String addHaha(HttpServletRequest request,Haha haha){
        int i = service.add(haha);
        if (i>0){
            return "redirect:/controller/findAll";
        }else {
            request.setAttribute("message","添加账户失败");
            return "addList";
        }
    }
    @RequestMapping("/updateHaha")
    public String updateHaha(HttpServletRequest request,Haha haha){
        int i = service.update(haha);
        if (i>0){
            return "redirect:/controller/findAll";
        }else {
            request.setAttribute("message","修改错误");
            return "updateHaha";
        }
    }
    @RequestMapping("/getHaha")
    public String getHahaById(HttpServletRequest request,int id){
        Haha haha = service.getHahaById(id);
        System.out.println(haha);
        HttpSession session = request.getSession();
        session.setAttribute("haha",haha);
        return "updateHaha";
    }
    @RequestMapping("/delHaha")
    public String delHaha(HttpServletRequest request,int id){
        int i = service.delHaha(id);
        if (i>0){
            return "forward:findAll";
        }else {
            request.setAttribute("message","修改错误");
            return "list";
        }
    }

}
