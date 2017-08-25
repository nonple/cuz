package univ.smu.cuz.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

/**
 * PicDAO
 * @author sukhwan
 *
 */
@Repository(value = "picDAO")
public class PicDAO extends AbstractDAO{

	/**
	 * ����׷� �Է�
	 * @param paramMap
	 */
	public void insertPic(Map<String,Object> paramMap){
		this.insert("pic.insertPic", paramMap);
	}
	
	/**
	 * �� ����׷� ��� ����
	 * @param userSeq
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Map<String,Object>> selectMyPicList(String userSeq){
		return this.selectList("pic.selectMyPicList", userSeq);
	}
	
	/**
	 * ����׷� ��� �˻�
	 * @param userSeq
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Map<String,Object>> selectPicSearch(String userSeq){
		return this.selectList("pic.selectPicSearch", userSeq);
	}
	
	/**
	 * ����׷� ����
	 * @param picSeq
	 */
	public void deletePic(String picSeq){
		this.update("pic.deletePic", picSeq);
	}
	
	/**
	 * ����׷� ����
	 * @param paramMap
	 */
	public void updatePic(Map<String,Object> paramMap){
		this.update("pic.updatePic", paramMap);
	}
	
	
}
