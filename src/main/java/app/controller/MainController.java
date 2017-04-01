package app.controller;

import app.dao.TransactionDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    TransactionDao transactionDao;

    @Autowired
    SessionFactory sessionFactory;

    @RequestMapping(value = "home")
    public String getHome() {
        return "homepage";
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test() {
        return "test complete";
    }

    @RequestMapping(value = "/test2")
    @ResponseBody
    public String test2() {
        return "test2 complete";
    }

}
