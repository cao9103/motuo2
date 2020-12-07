package com.shitouren.core.service;

import com.shitouren.core.autogenerate.bean.RealName;
import com.shitouren.core.autogenerate.bean.RealNameExample;
import com.shitouren.core.autogenerate.bean.Users;
import com.shitouren.core.autogenerate.dao.RealNameDao;
import com.shitouren.core.autogenerate.dao.UsersDao;
import com.shitouren.core.bean.eums.ImgEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class MineServiceImpl implements MineService {

    @Autowired(required = false)
    UsersDao usersDao;
    @Autowired(required = false)
    RealNameDao realNameDao;

    /**
     * 我的信息
     *
     * @param userId
     * @return
     */
    public Map<String, Object> getMineInfo(Integer userId) {
        Map<String, Object> map = new HashMap<>();
        Users user = usersDao.selectByPrimaryKey(userId);
        map.put("avatar", ImgEnum.img.getUrl() + user.getHeadPrtraits());//头像
        map.put("nickname", user.getNickName());//昵称
        map.put("ID", user.getUserId());//id
        if (user.getLevel() == 0) {
            map.put("userLevel", "普通会员");//用户等级
        } else {
            map.put("userLevel", "正式会员");//用户等级
        }
        map.put("ada", user.getAdacurrency());//ADA币
        map.put("sapling", user.getSapling());//种子
        map.put("leijireward", user.getLeijiReward());//累计收益
        map.put("assetsheld", user.getAssetsHeld());//持有资产
        map.put("tuijianreward", user.getTuijianReward());//推荐收益
        map.put("teamreward", user.getTeamReward());//团队收益
//        map.put("phone", user.getPhoneNumber());//电话
//        map.put("code", user.getRegisterCode());//邀请码
        RealNameExample realNameExample = new RealNameExample();
        realNameExample.createCriteria().andUserIdEqualTo(userId);
        List<RealName> realNames = realNameDao.selectByExample(realNameExample);
        map.put("isRealName", realNames.size() == 0 ? "0" : realNames.get(0).getStatus());
        return map;
    }
}
