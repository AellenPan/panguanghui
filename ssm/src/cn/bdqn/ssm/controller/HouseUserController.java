package cn.bdqn.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.bdqn.ssm.pojo.HouseUser;
import cn.bdqn.ssm.service.HouseUserService;

/*
 * @author:MelodyChiu
 * @date:2017-6-21 ����4:14:56
 * @version:1.0
 * @description:TODO
 */
@Controller
@RequestMapping("/user")
public class HouseUserController {
	@Resource
	private HouseUserService userService;
	@RequestMapping(value="login.html")
	public String login(){
		return "login";
	}
	@RequestMapping(value="doLogin",method=RequestMethod.POST)
	public String doLogin(@RequestParam String username,
						@RequestParam String password,
						HttpServletRequest request,
						HttpSession session){
		HouseUser user=userService.loginHouseUser(username, password);
		if(null != user){//��¼�ɹ�
			//����session
			session.setAttribute("user", user);
			//ҳ����ת��main.jsp��
			return "redirect:/user/main";
		}else{
			//ҳ����ת��login.jsp��������ʾ��Ϣ--ת��
			request.setAttribute("error", "�û��������벻��ȷ");
			return "login";
		}		
	}
	@RequestMapping(value="/main")
	public String main(HttpSession session){
		if(session.getAttribute("user") == null){
			return "redirect:/user/login";
		}
		return "main";		
	}
}