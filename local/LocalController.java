package com.multi.www.local;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class LocalController {
	
	@Autowired
	Local_touristdestinationDAO dao;
	
	@Autowired
	Local_restaurantDAO dao2;
		
	@Autowired
	Local_accommodationInter dao3;
	
	@Autowired
	PageService page;
	
	//관광지
	@RequestMapping("local/listdestination")
	public void all(PageVO vo, Model model) {
	
	vo.setStartEnd(vo.getPage());
	List<Local_touristdestinationVO> list = dao.all(vo);
	int count = dao.count();
	int pages = page.pages(count);
	
	
	model.addAttribute("list", list);
	model.addAttribute("pages", pages);
	model.addAttribute("count", count);
	
	
	
	}	
	
	@RequestMapping("local/listdestination2")
		public void all11(Local_touristdestinationVO vo, Model model) {

		List<Local_touristdestinationVO> list = dao.all11(vo);
		model.addAttribute("list", list);
		System.out.println(list);
	}
	
	@RequestMapping("local/onedestination")
		public void one(Local_touristdestinationVO vo, Model model) {
		Local_touristdestinationVO one = dao.one(vo);
		model.addAttribute("one", one);

	}
	
	//음식점
	@RequestMapping("local/listrestaurant")
		public void all2(PageVO vo, Model model) {
		
		vo.setStartEnd(vo.getPage());
		List<Local_restaurantVO> list = dao2.all2(vo);
		int count = dao.count();
		int pages = page.pages(count);
		
		model.addAttribute("list", list);
		model.addAttribute("pages", pages);
		model.addAttribute("count", count);
	
	}
	
	@RequestMapping("local/listrestaurant2")
		public void all22(Local_restaurantVO vo, Model model) {

		List<Local_restaurantVO> list = dao2.all22(vo);
		model.addAttribute("list", list);
		
	}
	
	

	@RequestMapping("local/onerestaurant")
		public void one2(Local_restaurantVO vo, Model model) {
		Local_restaurantVO one2 = dao2.one2(vo);
		model.addAttribute("one2", one2);
	
	}
	
	//숙박
	@RequestMapping("local/listaccommodation")
		public void all3(PageVO vo, Model model) {
		
		vo.setStartEnd(vo.getPage());
		List<Local_accommodationVO> list = dao3.all3(vo);
		int count = dao.count();
		int pages = page.pages(count);
		
		
		model.addAttribute("list", list);
		model.addAttribute("pages", pages);
		model.addAttribute("count", count);
		
		System.out.println("성공" + pages + count);

	}
	

	@RequestMapping("local/listaccommodation2")
		public void all33(Local_accommodationVO vo, Model model) {

		List<Local_accommodationVO> list = dao3.all33(vo);
		model.addAttribute("list", list);
		
	}
	
	
	@RequestMapping("local/oneaccommodation")
		public void one3(Local_accommodationVO vo, Model model) {
		Local_accommodationVO one3 = dao3.one3(vo);
		model.addAttribute("one3", one3);
		

	}
	
	
	
}
