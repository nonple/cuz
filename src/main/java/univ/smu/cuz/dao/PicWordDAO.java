package univ.smu.cuz.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository(value = "picWordDAO")
public class PicWordDAO extends AbstractDAO{
	
	/**
	 * 픽토그램 단어 조회
	 * @param userSeq
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Map<String,Object>> selectMyPicList(String userSeq){
		return this.selectList("pic.word.selectPicWordList", userSeq);
	}
	
	/**
	 * 단어장에 단어 추가
	 * @param paramMap
	 */
	public void insertPicWord(Map<String,Object> paramMap){
		this.insert("pic.word.insertPicWord", paramMap);
	}
	
	/**
	 * 단어장에 단어 삭제
	 * @param paramMap
	 */
	public void deletePicWord(Map<String,Object> paramMap){
		this.delete("pic.word.deletePicWord", paramMap);
	}
	
	/**
	 * 단어 제목 삭제
	 * @param paramMap
	 */
	public void updatePicWordTitle(Map<String,Object> paramMap){
		this.update("pic.word.updatePicWordTitle", paramMap);
	}
	
	
}
