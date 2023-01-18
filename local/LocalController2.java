package com.multi.www.local;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocalController2 {

	@Autowired
	Local_touristdestinationDAO2 dao;

	@RequestMapping("localEditV/insert1")
	public void insert1(Local_touristdestinationVO vo) {
		dao.insert(vo);
	}

	@RequestMapping("localEditV/search1")
	public void one1(Local_touristdestinationVO vo, Model model) {
		Local_touristdestinationVO result = dao.one(vo);
		model.addAttribute("vo", result);
	}

	@RequestMapping("localEditV/update1")
	public void update1(Local_touristdestinationVO vo) {
		dao.update(vo);
	}

	@RequestMapping("localEditV/delete1")
	public void delete1(Local_touristdestinationVO vo) {
		dao.delete(vo);
	}

	@Autowired
	Local_accommodationDAO2 dao2;

	@RequestMapping("localEditV/insert2")
	public void insert2(Local_accommodationVO vo) {
		dao2.insert(vo);
	}

	@RequestMapping("localEditV/search2")
	public void one2(Local_accommodationVO vo, Model model) {
		Local_accommodationVO result = dao2.one(vo);
		model.addAttribute("vo", result);
	}

	@RequestMapping("localEditV/update2")
	public void update2(Local_accommodationVO vo) {
		dao2.update(vo);
	}

	@RequestMapping("localEditV/delete2")
	public void delete2(Local_accommodationVO vo) {
		dao2.delete(vo);
	}

	@Autowired
	Local_restaurantDAO2 dao3;

	@RequestMapping("localEditV/insert3")
	public void insert3(Local_restaurantVO vo) {
		dao3.insert(vo);
	}

	@RequestMapping("localEditV/search3")
	public void one3(Local_restaurantVO vo, Model model) {
		Local_restaurantVO result = dao3.one(vo);
		model.addAttribute("vo", result);
	}

	@RequestMapping("localEditV/update3")
	public void update3(Local_restaurantVO vo) {
		dao3.update(vo);
	}

	@RequestMapping("localEditV/delete3")
	public void delete3(Local_restaurantVO vo) {
		dao3.delete(vo);
	}

}
