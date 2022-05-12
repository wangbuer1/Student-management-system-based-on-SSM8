package com.yanzhen.controller;

import com.yanzhen.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/request")
public class RequestController {

    @Autowired
    private RequestService requestService;


}
