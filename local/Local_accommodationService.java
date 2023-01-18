package com.multi.www.local;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Local_accommodationService {

	@Autowired
	Local_accommodationDAO dao;
	
	public List<Local_accommodationVO> all3(PageVO vo) {
		return dao.all3(vo);
	}
	
	public List<Local_accommodationVO> all33(Local_accommodationVO vo) {
		return dao.all33(vo);
	}
	
	
	public Local_accommodationVO one3(Local_accommodationVO vo) {
		return dao.one3(vo);
	
	}
	
	public int count() {
		return dao.count();
	}
	
}
