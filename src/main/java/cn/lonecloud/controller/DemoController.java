package cn.lonecloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lonecloud on 16/12/26.
 */
@RestController//相当于@Controller@ResponseBody
public class DemoController {

    /**
     * 使用Post请求方式
     * @return
     */
//    @RequestMapping(value = "/request",method = RequestMethod.POST)
    @PutMapping(value = "/request")
    public String request(){
        return "hahh";
    }
//    @RequestMapping(value = "/request",method = RequestMethod.GET)
    @GetMapping("/requsetGet")
    public String requestGet(){
        return "hahh";
    }
}
