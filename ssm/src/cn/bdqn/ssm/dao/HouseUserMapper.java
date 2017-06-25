package cn.bdqn.ssm.dao;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.ssm.pojo.HouseUser;

/*
 * @author:MelodyChiu
 * @date:2017-6-21 обнГ4:02:43
 * @version:1.0
 * @description:TODO
 */
public interface HouseUserMapper {
	public HouseUser getUser(@Param("username")String username);
}