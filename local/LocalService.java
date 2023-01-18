package com.multi.www.local;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalService {
		
		// °ü±¤Áö
		@Autowired
		Local_touristdestinationDAO2 dao;

		public int insert(Local_touristdestinationVO vo) {
			return dao.insert(vo);
		}

		public Local_touristdestinationVO one2(Local_touristdestinationVO vo) {
			return dao.one(vo);
		}

		public int update(Local_touristdestinationVO vo) {
			return dao.update(vo);
		}

		public int delete(Local_touristdestinationVO vo) {
			return dao.delete(vo);
		}
		
		// ¼÷¹Ú
		@Autowired
		Local_accommodationDAO2 dao2;

		public int insert(Local_accommodationVO vo) {
			return dao2.insert(vo);
		}

		public Local_accommodationVO one2(Local_accommodationVO vo) {
			return dao2.one(vo);
		}

		public int update(Local_accommodationVO vo) {
			return dao2.update(vo);
		}

		public int delete(Local_accommodationVO vo) {
			return dao2.delete(vo);
		}
		
		// À½½ÄÁ¡
		@Autowired
		Local_restaurantDAO2 dao3;

		public int insert(Local_restaurantVO vo) {
			return dao3.insert(vo);
		}

		public Local_restaurantVO one2(Local_restaurantVO vo) {
			return dao3.one(vo);
		}

		public int update(Local_restaurantVO vo) {
			return dao3.update(vo);
		}

		public int delete(Local_restaurantVO vo) {
			return dao3.delete(vo);
		}

}
