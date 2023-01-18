package com.multi.www.local;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocalController2 {

	@Autowired
	Local_touristdestinationDAO2 dao;

	@RequestMapping("localEditV/insert")
	public void insert(Local_touristdestinationVO vo) {
		dao.insert(vo);
	}

	@RequestMapping("localEditV/search")
	public void one(Local_touristdestinationVO vo, Model model) {
		Local_touristdestinationVO result = dao.one(vo);
		model.addAttribute("vo", result);
	}

	@RequestMapping("localEditV/update")
	public void update(Local_touristdestinationVO vo) {
		dao.update(vo);
	}

	@RequestMapping("localEditV/delete")
	public void delete(Local_touristdestinationVO vo) {
		dao.delete(vo);
	}

	@Autowired
	Local_accommodationDAO2 dao2;

	@RequestMapping("localEditV/insert")
	public void insert(Local_accommodationVO vo) {
		dao2.insert(vo);
	}

	@RequestMapping("localEditV/search")
	public void one(Local_accommodationVO vo, Model model) {
		Local_accommodationVO result = dao2.one(vo);
		model.addAttribute("vo", result);
	}

	@RequestMapping("localEditV/update")
	public void update(Local_accommodationVO vo) {
		dao2.update(vo);
	}

	@RequestMapping("localEditV/delete")
	public void delete(Local_accommodationVO vo) {
		dao2.delete(vo);
	}

	@Autowired
	Local_restaurantDAO2 dao3;

	@RequestMapping("localEditV/insert")
	public void insert(Local_restaurantVO vo) {
		dao3.insert(vo);
	}

	@RequestMapping("localEditV/search")
	public void one(Local_restaurantVO vo, Model model) {
		Local_restaurantVO result = dao3.one(vo);
		model.addAttribute("vo", result);
	}

	@RequestMapping("localEditV/update")
	public void update(Local_restaurantVO vo) {
		dao3.update(vo);
	}

	@RequestMapping("localEditV/delete")
	public void delete(Local_restaurantVO vo) {
		dao3.delete(vo);
	}

}
