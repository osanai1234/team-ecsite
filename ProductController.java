package jp.co.internous.wasabi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import jp.co.internous.wasabi.model.domain.MstProduct;
import jp.co.internous.wasabi.model.mapper.MstProductMapper;
import jp.co.internous.wasabi.model.session.LoginSession;

@Controller
@RequestMapping("/wasabi/product")
public class ProductController {
	
	@Autowired
	 private MstProductMapper mstProductMapper;
	@Autowired
	private LoginSession loginSession;

		 @RequestMapping("/{id}")
		 public String productDetail(Model m, @PathVariable("id") int id) {
			 MstProduct  ProductMapper = mstProductMapper.findById(id);
		
		m.addAttribute("MstProductMapper",ProductMapper);
		m.addAttribute("loginSeeion",loginSession);
		
		return "product_detail";
	}
}
