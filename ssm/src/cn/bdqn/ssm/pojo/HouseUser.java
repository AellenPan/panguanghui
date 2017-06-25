package cn.bdqn.ssm.pojo;
/*
 * @author:MelodyChiu
 * @date:2017-6-19 上午9:08:30
 * @version:1.0
 * @description:相当于ssh框架中，hibernate框架对应的entity实体类
 */
public class HouseUser {
	private Integer id;
	private String username;
	private String password;
	private String telephone;
	private String realname;
	private String isadmin;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getIsadmin() {
		return isadmin;
	}
	public void setIsadmin(String isadmin) {
		this.isadmin = isadmin;
	}
}