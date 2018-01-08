package com.mkyong;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PSGController {

	@RequestMapping(value = "/paymentModal", method = RequestMethod.GET)
	public ModelAndView paymentModal(ModelAndView modelAndView, HttpServletRequest request) {

		//return new ModelAndView("payment", "command", new Payment());

		Payment payment = new Payment();
		
		modelAndView.addObject("payment", payment);
		modelAndView.setViewName("paymentModal");
		return modelAndView;

	}
	
	@RequestMapping(value = "/paymentIFrameEmbedded", method = RequestMethod.GET)
	public ModelAndView paymentIFrameEmbedded(ModelAndView modelAndView, HttpServletRequest request) {

		//return new ModelAndView("payment", "command", new Payment());

		Payment payment = new Payment();
		
		modelAndView.addObject("payment", payment);
		modelAndView.setViewName("paymentIFrameEmbedded");
		return modelAndView;

	}

	@RequestMapping(value = "/payment", method = RequestMethod.GET)
	public ModelAndView payment(ModelAndView modelAndView, HttpServletRequest request) {

		//return new ModelAndView("payment", "command", new Payment());

		Payment payment = new Payment();
		
		modelAndView.addObject("payment", payment);
		modelAndView.setViewName("payment");
		return modelAndView;

	}
	
	@RequestMapping(value = "/payment2", method = RequestMethod.GET)
	public ModelAndView payment2(ModelAndView modelAndView, HttpServletRequest request) {

		//return new ModelAndView("payment", "command", new Payment());

		Payment payment = new Payment();
		
		modelAndView.addObject("payment", payment);
		modelAndView.setViewName("payment2");
		return modelAndView;

	}
	
	@RequestMapping(value = "/payment3", method = RequestMethod.GET)
	public ModelAndView payment3(ModelAndView modelAndView, HttpServletRequest request) {

		//return new ModelAndView("payment", "command", new Payment());

		Payment payment = new Payment();
		
		modelAndView.addObject("payment", payment);
		modelAndView.setViewName("payment3");
		return modelAndView;

	}	

	@RequestMapping(value = "/payment4", method = RequestMethod.GET)
	public ModelAndView payment4(ModelAndView modelAndView, HttpServletRequest request) {

		//return new ModelAndView("payment", "command", new Payment());

		Payment payment = new Payment();
		
		modelAndView.addObject("payment", payment);
		modelAndView.setViewName("payment4");
		return modelAndView;

	}	

	@RequestMapping(value = "/payment5", method = RequestMethod.GET)
	public ModelAndView payment5(ModelAndView modelAndView, HttpServletRequest request) {

		//return new ModelAndView("payment", "command", new Payment());

		Payment payment = new Payment();
		
		modelAndView.addObject("payment", payment);
		modelAndView.setViewName("payment5");
		return modelAndView;

	}	
	@RequestMapping(value = "/savePayment", method = RequestMethod.POST)
	public void savePayment(ModelAndView modelAndView, HttpServletResponse response) {

		try {
			response.sendRedirect("https://localhost:9443/bingo/PaymentReceiptServlet");
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}
