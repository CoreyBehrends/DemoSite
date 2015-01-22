package com.mycompany.admin.controller;

import org.broadleafcommerce.openadmin.web.controller.AdminAbstractController;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/" + MyController.SECTION_KEY)
@Secured("PERMISSION_OTHER_DEFAULT")
public class MyController extends AdminAbstractController {

    protected static final String SECTION_KEY = "test";

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String test(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
        setModelAttributes(model, SECTION_KEY);
        return "myTemplates/test";
    }

}