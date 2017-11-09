package cn.lonecloud.controller;

import cn.lonecloud.dao.BoyDao;
import cn.lonecloud.model.Boy;
import cn.lonecloud.service.BoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lonecloud on 16/12/26.
 */
@RestController
public class BoyController {
    @Autowired
    private BoyDao boyDao;
    @Autowired
    private BoyService boyService;
    /**
     * 查找全部----测试git修改后的push
     *
     * @return
     */
    @RequestMapping("/boy")
    public List<Boy> findAll() {
        return boyDao.findAll();
    }

    /**
     * 增加
     *
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("/add")
    public Boy add(@RequestParam(name = "name") String name, @RequestParam(name = "age") int age) {
        Boy boy = new Boy();
        boy.setAge(age);
        boy.setName(name);
        return boyService.add(boy);
    }

    /**
     * 更新
     * @param id
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("/update/{id}")
    public Boy update(@PathVariable(name = "id") Long id, @RequestParam(name = "name") String name, @RequestParam(name = "age") int age) {
        Boy boy = new Boy();
        boy.setId(id);
        boy.setAge(age);
        boy.setName(name);
        return boyDao.save(boy);
    }

    /**
     * 删除
     * @param id
     */
    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable(name = "id")Long id){
        boyDao.delete(id);
    }

    /**
     * id查找
     * @param id
     * @return
     */
    @RequestMapping("/findOne/{id}")
    public Boy findOne(@PathVariable(name = "id")Long id){
        return boyDao.findOne(id);
    }

    /**
     * age查找
     * @param age
     * @return
     */
    @RequestMapping("/findByAge/{id}")
    public List<Boy> findByAge(@PathVariable(name = "id")int age){
        return boyDao.findByAge(age);
    }
}
