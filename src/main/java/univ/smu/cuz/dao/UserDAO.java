package univ.smu.cuz.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository(value = "userDAO")
public class UserDAO extends AbstractDAO{
	
	/**
	 * ȸ�� ���
	 * @param paramMap
	 */
	public void insertUser(Map<String,Object> paramMap){
		this.insert("user.insertUser", paramMap);
	}
	
	/**
	 * ��й�ȣ ��ȸ
	 * @param email
	 * @return
	 */
	public String selectPw(String email){
		return (String) this.selectOne("user.selectPw",email);
	}
	
	/**
	 * �̸��� �ߺ� �˻�
	 * @param email
	 * @return
	 */
	public String selectEmail(String email){
		return (String) this.selectOne("user.selectEmail", email);
	}
	
	/**
	 * ȸ�� Ż��
	 * @param userSeq
	 */
	public void deleteUser(String userSeq){
		this.update("user.deleteUser", userSeq);
	}
	
	/**
	 * ��й�ȣ ����
	 * @param pw
	 */
	public void updatePw(String pw){
		this.update("user.updatePw", pw);
	}
}
