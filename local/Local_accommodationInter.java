package com.multi.www.local;

import java.util.List;

public interface Local_accommodationInter {
	
	//추상메서드 (블인장힌메서드다
	List<Local_accommodationVO> all3(PageVO vo);

	List<Local_accommodationVO> all33(Local_accommodationVO vo);

	int count();

	Local_accommodationVO one3(Local_accommodationVO vo);

}