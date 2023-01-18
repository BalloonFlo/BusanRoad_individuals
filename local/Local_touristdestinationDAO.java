package com.multi.www.local;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Local_touristdestinationDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	
	public List<Local_touristdestinationVO> all(PageVO vo) {
		return my.selectList("local.listdestination", vo);
	}
	
	public List<Local_touristdestinationVO> all11(Local_touristdestinationVO vo) {
		//List<Local_touristdestinationVO> list2 = my.selectList("local.listdestination2", vo);
		
		//System.out.println(list2);
		return my.selectList("local.listdestination2", vo);
	}
	
	public int count() {
		return my.selectOne("local.count");
	}
	
	public Local_touristdestinationVO one(Local_touristdestinationVO vo) {
		
		return my.selectOne("local.onedestination", vo);
	
	}
	
}
