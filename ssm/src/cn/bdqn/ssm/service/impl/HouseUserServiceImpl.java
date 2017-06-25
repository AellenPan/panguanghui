package cn.bdqn.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.bdqn.ssm.dao.HouseUserMapper;
import cn.bdqn.ssm.pojo.HouseUser;
import cn.bdqn.ssm.service.HouseUserService;

/*
 * @author:MelodyChiu
 * @date:2017-6-21 ÏÂÎç4:10:40
 * @version:1.0
 * @description:TODO
 */
@Service
public class HouseUserServiceImpl implements HouseUserService {
	@Resource
	private HouseUserMapper userMapper;

	@Override
	public HouseUser loginHouseUser(String username,String password) {
		HouseUser user=userMapper.getUser(username);
		if(null!=user){
			if(!password.equals(user.getPassword())){
				user=null;
			}
		}
		return user;
	}
}