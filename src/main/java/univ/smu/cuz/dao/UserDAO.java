package univ.smu.cuz.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository(value = "userDAO")
public class UserDAO extends AbstractDAO{
	
	/**
	 * 회원 등록
	 * @param paramMap
	 */
	public void insertUser(Map<String,Object> paramMap){
		this.insert("user.insertUser", paramMap);
	}
	
	/**
	 * 비밀번호 조회
	 * @param email
	 * @return
	 */
	public String selectPw(String email){
		return (String) this.selectOne("user.selectPw",email);
	}
	
	/**
	 * 이메일 중복 검사
	 * @param email
	 * @return
	 */
	public String selectEmail(String email){
		return (String) this.selectOne("user.selectEmail", email);
	}
	
	/**
	 * 회원 탈퇴
	 * @param userSeq
	 */
	public void deleteUser(String userSeq){
		this.update("user.deleteUser", userSeq);
	}
	
	/**
	 * 비밀번호 변경
	 * @param pw
	 */
	public void updatePw(String pw){
		this.update("user.updatePw", pw);
	}
}
