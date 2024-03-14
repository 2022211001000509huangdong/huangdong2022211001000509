package com.week2.demo;

import com.example.huangdong2022211001000509.HelloServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        Date date = new Date();
        String a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        writer.println("Name : Huang Dong \n" +
                "Id : 2022211001000509\n" +
                "Date and Time : " + a);

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){}

}
