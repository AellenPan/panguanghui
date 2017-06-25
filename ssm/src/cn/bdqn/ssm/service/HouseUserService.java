package cn.bdqn.ssm.service;

import cn.bdqn.ssm.pojo.HouseUser;

/*
 * @author:MelodyChiu
 * @date:2017-6-21 обнГ4:09:20
 * @version:1.0
 * @description:TODO
 */
public interface HouseUserService {
	public HouseUser loginHouseUser(String username,String password);
}