package univ.smu.cuz.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository(value = "likeDAO")
public class LikeDAO extends AbstractDAO{
	
	/**
	 * �� �ϱ�
	 * @param paramMap
	 */
	public void insertLike(Map<String,Object> paramMap){
		this.insert("like.insertLike", paramMap);
	}
	
	/**
	 * �� ����
	 * @param paramMap
	 */
	public void deleteLike(Map<String,Object> paramMap){
		this.delete("like.deleteLike", paramMap);
	}
}
