package com.multi.www.local;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class Local_touristdestinationDAO2 {

	@Autowired
	SqlSessionTemplate my;

	public int insert(Local_touristdestinationVO vo) {
		System.out.println("dao" + vo);
		return my.insert("tour.insert", vo);
	}

	public Local_touristdestinationVO one(Local_touristdestinationVO vo) {
		return my.selectOne("tour.one", vo);
	}

	public int update(Local_touristdestinationVO vo) {
		return my.update("tour.update", vo);
	}

	public int delete(Local_touristdestinationVO vo) {
		return my.delete("tour.delete", vo);
	}

}
