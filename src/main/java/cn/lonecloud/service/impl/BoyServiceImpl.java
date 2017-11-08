package cn.lonecloud.service.impl;

import cn.lonecloud.dao.BoyDao;
import cn.lonecloud.model.Boy;
import cn.lonecloud.service.BoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lonecloud on 16/12/26.
 */
@Service
@Transactional  //加入事务
public class BoyServiceImpl implements BoyService {
    @Autowired
    private BoyDao boyDao;

    /**
     * 保存
     * @param boy
     * @return
     */
    public Boy add(Boy boy){
        return boyDao.save(boy);
    }
}
