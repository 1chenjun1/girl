package cn.lonecloud.controller;

import cn.lonecloud.model.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lonecloud on 16/12/24.
 */
@RestController
public class HelloController {

    @Value("${girl.cupSize}")
    private String cupSize;
    @Value("${girl.year}")
    private String year;
    @Autowired
    private Girl girl;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String Hello() {
        return "cupSize" + cupSize + "year" + year;
    }

    @RequestMapping(value="/hello2",method = RequestMethod.GET)
    public String Hello2(){
        return "girl"+girl.getYear()+"cupSize"+girl.getCupSize();
    }

    /**
     * 作为参数
     * @param id
     * @return
     * http://localhost:8080/hello/100/hello3
     */
    @RequestMapping(value = "/{id}/hello3")
    public String Hello03(@PathVariable(name = "id",required = false) int id){
        return "id:"+id;
    }
    /**
     * 作为参数
     * @param id
     * @return
     * http://localhost:8080/hello/hello3?id=1212
     */
    @RequestMapping(value = "/hello3")
    public String Hello04(@RequestParam(name = "id",required = false) int id){
        return "id:"+id;
    }
}
