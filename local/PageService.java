package com.multi.www.local;

import org.springframework.stereotype.Service;

@Service //싱글톤
public class PageService {

	public int pages(int count) {
		int pages = 0;
		if(count % 10 == 0) {
			pages = count / 12; //120개 --> 12pages
		}else {
			pages = count / 12 + 1; //122개 --> 13pages 
		}
		return pages;
	}
	
}

