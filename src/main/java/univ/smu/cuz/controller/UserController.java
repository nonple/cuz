package univ.smu.cuz.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import univ.smu.cuz.dao.UserDAO;


@RestController
public class UserController {
	
	@Resource(name="userDAO")
	UserDAO userDAO;
	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public void getTest(){
		System.out.println("hihihihi");
		userDAO.test();
	}
}
