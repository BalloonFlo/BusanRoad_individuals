package com.multi.www.local;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Local_restaurantDAO2 {
	
	@Autowired
	SqlSessionTemplate my;

	public int insert(Local_restaurantVO vo) {
		System.out.println("dao" + vo);
		return my.insert("rest.insert", vo);
	}

	public Local_restaurantVO one(Local_restaurantVO vo) {
		return my.selectOne("rest.one", vo);
	}

	public int update(Local_restaurantVO vo) {
		return my.update("rest.update", vo);
	}

	public int delete(Local_restaurantVO vo) {
		return my.delete("rest.delete", vo);
	}

}
