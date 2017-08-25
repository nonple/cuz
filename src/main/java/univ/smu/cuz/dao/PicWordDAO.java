package univ.smu.cuz.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository(value = "picWordDAO")
public class PicWordDAO extends AbstractDAO{
	
	/**
	 * ����׷� �ܾ� ��ȸ
	 * @param userSeq
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Map<String,Object>> selectMyPicList(String userSeq){
		return this.selectList("pic.word.selectPicWordList", userSeq);
	}
	
	/**
	 * �ܾ��忡 �ܾ� �߰�
	 * @param paramMap
	 */
	public void insertPicWord(Map<String,Object> paramMap){
		this.insert("pic.word.insertPicWord", paramMap);
	}
	
	/**
	 * �ܾ��忡 �ܾ� ����
	 * @param paramMap
	 */
	public void deletePicWord(Map<String,Object> paramMap){
		this.delete("pic.word.deletePicWord", paramMap);
	}
	
	/**
	 * �ܾ� ���� ����
	 * @param paramMap
	 */
	public void updatePicWordTitle(Map<String,Object> paramMap){
		this.update("pic.word.updatePicWordTitle", paramMap);
	}
	
	
}
