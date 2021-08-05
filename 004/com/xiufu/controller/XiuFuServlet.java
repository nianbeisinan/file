package com.xiufu.controller;

import com.alibaba.fastjson.JSON;
import com.xiufu.entity.XiuFu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "XiuFuServlet", urlPatterns = "/XiuFuServlet")
public class XiuFuServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //字符编码
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");
        //创建一个修复数组
        List<XiuFu> list=new ArrayList<>();
        XiuFu x1 = new XiuFu();
        x1.setId(1);
        x1.setXuhao(005);
        x1.setShuliang(4);
        x1.setJibie("高危");
        x1.setYuming("www.baidu.com");
        x1.setType("用户名遍历漏洞");
        x1.setTongzhi(true);
        x1.setFankui(true);
        x1.setFuce(true);
        x1.setXiufu(true);
        list.add(x1);

        XiuFu x2 = new XiuFu();
        x1.setId(2);
        x2.setXuhao(004);
        x2.setShuliang(4);
        x2.setJibie("高危");
        x2.setYuming("www.baidu.com");
        x2.setType("用户名遍历漏洞");
        x2.setTongzhi(true);
        x2.setFankui(true);
        x2.setFuce(true);
        x2.setXiufu(true);
        list.add(x2);

        XiuFu x3 = new XiuFu();
        x3.setId(3);
        x3.setXuhao(003);
        x3.setShuliang(4);
        x3.setJibie("高危");
        x3.setYuming("www.baidu.com");
        x3.setType("用户名遍历漏洞");
        x3.setTongzhi(true);
        x3.setFankui(true);
        x3.setFuce(true);
        x3.setXiufu(true);
        list.add(x3);

        XiuFu x4 = new XiuFu();
        x4.setId(4);
        x4.setXuhao(002);
        x4.setShuliang(4);
        x4.setJibie("高危");
        x4.setYuming("www.baidu.com");
        x4.setType("用户名遍历漏洞");
        x4.setTongzhi(true);
        x4.setFankui(true);
        x4.setFuce(true);
        x4.setXiufu(true);
        list.add(x4);

        XiuFu x5 = new XiuFu();
        x5.setId(5);
        x5.setXuhao(001);
        x5.setShuliang(4);
        x5.setJibie("高危");
        x5.setYuming("www.baidu.com");
        x5.setType("用户名遍历漏洞");
        x5.setTongzhi(true);
        x5.setFankui(true);
        x5.setFuce(true);
        x5.setXiufu(true);
        list.add(x5);

        //自己创建一个layui后台的json格式
        Map map=new HashMap<>();
        map.put("code",0); //默认必须是0 不然不显示
        map.put("msg","随便写");
        map.put("count",5); //多少条数据
        map.put("data",list); //具体的json数组
        String s = JSON.toJSONString(map); //转换类型
        //输出到前端
        PrintWriter writer = resp.getWriter();
        writer.println(s);
        writer.close();
    }
}
