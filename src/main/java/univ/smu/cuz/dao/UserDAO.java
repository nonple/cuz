package univ.smu.cuz.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDAO")
public class UserDAO extends AbstractDAO{
	
	public void test(){
		System.out.println(this.selectOne("getTest"));
	}
	
}
