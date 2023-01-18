package com.multi.www.local;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Local_accommodationDAO2 {
	
	@Autowired
	SqlSessionTemplate my;

	public int insert(Local_accommodationVO vo) {
		System.out.println("dao" + vo);
		return my.insert("acco.insert", vo);
	}

	public Local_accommodationVO one(Local_accommodationVO vo) {
		return my.selectOne("acco.one", vo);
	}

	public int update(Local_accommodationVO vo) {
		return my.update("acco.update", vo);
	}

	public int delete(Local_accommodationVO vo) {
		return my.delete("acco.delete", vo);
	}

}
