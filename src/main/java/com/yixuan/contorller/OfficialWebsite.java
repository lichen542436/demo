package com.yixuan.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OfficialWebsite {

    @RequestMapping("/guanindex")
    public String guanIndex(){
        return "guanwang/guanindex";
    }
}
