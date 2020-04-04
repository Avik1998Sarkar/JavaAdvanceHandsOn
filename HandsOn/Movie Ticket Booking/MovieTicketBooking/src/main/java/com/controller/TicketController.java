package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Ticket;
import com.service.TicketService;

@Controller
public class TicketController {
	@Autowired
	private TicketService ticketService;

	@RequestMapping(value = "showpage", method = RequestMethod.GET)
	public String showPage(@ModelAttribute("ticket") Ticket ticket) {
		return "showpage";
	}

	@RequestMapping(value = "/calculateCost", method = RequestMethod.POST)
	public String calculateTotalCost(@ModelAttribute("ticket") Ticket ticket, ModelMap model, BindingResult result) {
		double totalCost = ticketService.calculateTotalCost(ticket);
		model.put("cost", totalCost);
		return "result";
	}

	@ModelAttribute("circleList")
	public Map<String, String> buildState(Model model) {
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("King", "King");
		mp.put("Queen", "Queen");
		return mp;
	}
}
