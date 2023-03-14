package com.geekbrains.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
// привязываем сервлет к нашму url
//http://localhost:8080/jee/prod
@WebServlet(name = "ProductServlet", urlPatterns = "/prod")

public class ProductServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Log: GET");
        System.out.println("Redirect");
        resp.setCharacterEncoding("UTF-8");
        // создаем продукты в классе Product переопредлили метод tostrin
        // добавляем их в лист
        ArrayList<String> list = new ArrayList<>();
        list.add(String.valueOf(new Product(1,"яблоко", (byte) 35)));
        list.add(String.valueOf(new Product(2,"груша", (byte) 36)));
        list.add(String.valueOf(new Product(3,"арбуз", (byte) 37)));
        list.add(String.valueOf(new Product(4,"дыня", (byte) 38)));
        list.add(String.valueOf(new Product(5,"слива", (byte) 39)));
        list.add(String.valueOf(new Product(6,"инжир", (byte) 40)));
        list.add(String.valueOf(new Product(7,"абрикос", (byte) 41)));
        list.add(String.valueOf(new Product(8,"персик", (byte) 42)));
        list.add(String.valueOf(new Product(9,"апельсин", (byte) 43)));
        list.add(String.valueOf(new Product(10,"мандарин", (byte) 44)));
// проходим по листу и выводим список на страницу
        for (String s : list) {


            resp.getWriter().printf("<html><body><h1>" + s + "</h1></body></html>");
        }
        HttpSession session = req.getSession();
        session.setAttribute("1", "abc");
//        resp.sendRedirect(req.getContextPath() + "/sec");
       // getServletContext().getRequestDispatcher("SecondServlet");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.debug("Log: POST");
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        System.out.println(session.getAttribute("1"));
        resp.getWriter().printf("<html><body><h1>New POST request</h1></body></html>");
    }

    @Override
    public void destroy() {
        logger.debug("Destroy");
    }

    @Override
    public void init() throws ServletException {
        logger.debug("Init");
    }
}