package com.facturador.danmar.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.facturador.danmar.model.Kiosko;

@Controller
public class DummyController {

	@RequestMapping("/Probando")
	public ModelAndView getVersion(){
		return new ModelAndView("version");
	}
	
//	@RequestMapping(value = "/getTestListDos", method = RequestMethod.GET)
//	public @ResponseBody List<Kiosko> obtenerListado(Model model,HttpServletRequest request) {
//	   
//		List<Kiosko> kioskos = new ArrayList<Kiosko>();
//	
//		Kiosko k1 = new Kiosko(12,"k1","prueba 1");
//		Kiosko k2 = new Kiosko(13,"k2","prueba 2");
//		Kiosko k3 = new Kiosko(14,"k3","prueba 3");
//		Kiosko k4 = new Kiosko(15,"k4","prueba 4");
//		Kiosko k5 = new Kiosko(16,"k5","prueba 5");
//		Kiosko k6 = new Kiosko(17,"k6","prueba 6");
//	
//		kioskos.add(k1);
//		kioskos.add(k2);
//		kioskos.add(k3);
//		kioskos.add(k4);
//		kioskos.add(k5);
//		kioskos.add(k6);
//
//	   return kioskos; 
//	}
}
