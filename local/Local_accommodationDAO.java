package com.multi.www.local;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Local_accommodationDAO implements Local_accommodationInter {
	
	@Autowired
	SqlSessionTemplate my;
	
	@Override
	public List<Local_accommodationVO> all3(PageVO vo) {
		return my.selectList("local.listaccommodation", vo);
	}
	
	@Override
	public List<Local_accommodationVO> all33(Local_accommodationVO vo) {
		
		return my.selectList("local.listaccommodation2", vo);	
	}
	
	@Override
	public int count() {
		return my.selectOne("local.count3");
	}
	
	@Override
	public Local_accommodationVO one3(Local_accommodationVO vo) {
		System.out.println(vo);
		return my.selectOne("local.oneaccommodation", vo);
	
	}
	
	
}
