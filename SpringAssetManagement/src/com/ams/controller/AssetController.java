package com.ams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ams.bean.Request;
import com.ams.service.IAssetService;

@Controller
public class AssetController {
	
	@Autowired
	private IAssetService assetserv;

	@RequestMapping("home")
	public String getHome()
	{
		return "home";
	}
	
	@RequestMapping("login")
	public String getLoginPage()
	{
		return "login";
	}
	
	@RequestMapping("managerDashboard")
	public String getManagerDashboard()
	{
		return "managerDashboard";
	}
	
	@RequestMapping(value="raiseRequest", method=RequestMethod.POST)
	public String getRequestPage(Model m,@ModelAttribute("requestObj") Request req)
	{
		System.out.println("in raise Request");
		m.addAttribute("requestObj",req);
		return "raiseRequest";
	}
	
	@RequestMapping(value="storeraiserequest")
	public String viewStatusPage(Model m,@ModelAttribute("requestObj") Request req)
	{
		System.out.println("In Store method");
		//String target=null;
		int reqid=assetserv.storeRaisedRequest(req);
		if(reqid>0)
		{
			System.out.println("in IF");
			m.addAttribute("requestObj",req);
			m.addAttribute("msg","Request Stored Successfully");
			m.addAttribute("requestId", reqid);
			return "viewStatus";
		}
		else{
			return "raiseRequest";
		}

	}
	
	
}
