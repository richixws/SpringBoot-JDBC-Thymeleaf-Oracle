package com.developer.controller;

import com.developer.dao.SalesDAO;
import com.developer.model.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SaleController {

    @Autowired
    private SalesDAO salesDAO;

    @RequestMapping("/")
    private String viewHomePage(Model model){
        List<Sale>  listSales=salesDAO.list();
        model.addAttribute("listsale",listSales);
        return "index";

    }

}
