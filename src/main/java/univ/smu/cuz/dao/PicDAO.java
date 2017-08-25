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
	 * 픽토그램 입력
	 * @param paramMap
	 */
	public void insertPic(Map<String,Object> paramMap){
		this.insert("pic.insertPic", paramMap);
	}
	
	/**
	 * 내 픽토그램 목록 선택
	 * @param userSeq
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Map<String,Object>> selectMyPicList(String userSeq){
		return this.selectList("pic.selectMyPicList", userSeq);
	}
	
	/**
	 * 픽토그램 목록 검색
	 * @param userSeq
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Map<String,Object>> selectPicSearch(String userSeq){
		return this.selectList("pic.selectPicSearch", userSeq);
	}
	
	/**
	 * 픽토그램 삭제
	 * @param picSeq
	 */
	public void deletePic(String picSeq){
		this.update("pic.deletePic", picSeq);
	}
	
	/**
	 * 픽토그램 수정
	 * @param paramMap
	 */
	public void updatePic(Map<String,Object> paramMap){
		this.update("pic.updatePic", paramMap);
	}
	
	
}
