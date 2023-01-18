package com.multi.www.local;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Local_restaurantDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public List<Local_restaurantVO> all2(PageVO vo) {
		return my.selectList("local.listrestaurant", vo);	
	}
	
	public List<Local_restaurantVO> all22(Local_restaurantVO vo) {
		
		return my.selectList("local.listrestaurant2",vo);	
	}
	
	public Local_restaurantVO one2(Local_restaurantVO vo) {
		
		return my.selectOne("local.onerestaurant", vo);
	
	}
	
	public int count() {
		return my.selectOne("local.count2");
	}
	
}
