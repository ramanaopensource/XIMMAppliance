package com.xockets.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xockets.beans.ApplianceDetail;

@Controller
@RequestMapping("/index.html")
public class ApplicanceDetailController {

	@RequestMapping("/index.html")
	public ModelAndView displayApplianceDetails() {
		List<ApplianceDetail> applianceDetails = (List<ApplianceDetail>) getApplianceDetails();
        return new ModelAndView("index", "appliances", applianceDetails);
    }

	private List<ApplianceDetail> getApplianceDetails() {
		List<ApplianceDetail> applianceDetails = new ArrayList();
		
		ApplianceDetail applianceDetail = new ApplianceDetail();
		applianceDetail.setApplianceId("br15.xockets.com-7078");
		applianceDetail.setApplianceAddress("br15.xockets.com:7078");
		applianceDetail.setApplianceState("ALIVE");
		applianceDetail.setApplianceCores("16 (0 Used)");
		applianceDetail.setApplianceMemory("4.6 GB (0.0 B Used)");
		
		ApplianceDetail applianceDetail1 = new ApplianceDetail();
		applianceDetail1.setApplianceId("br18.xockets.com-7078");
		applianceDetail1.setApplianceAddress("br18.xockets.com-7078");
		applianceDetail1.setApplianceState("ALIVE");
		applianceDetail1.setApplianceCores("16 (0 Used)");
		applianceDetail1.setApplianceMemory("4.6 GB (0.0 B Used)");
		
		ApplianceDetail applianceDetail2 = new ApplianceDetail();
		applianceDetail2.setApplianceId("br19.xockets.com-7078");
		applianceDetail2.setApplianceAddress("br19.xockets.com-7078");
		applianceDetail2.setApplianceState("ALIVE");
		applianceDetail2.setApplianceCores("19 (0 Used)");
		applianceDetail2.setApplianceMemory("5.6 GB (0.0 B Used)");
		
		ApplianceDetail applianceDetail3 = new ApplianceDetail();
		applianceDetail3.setApplianceId("br20.xockets.com-7078");
		applianceDetail3.setApplianceAddress("br20.xockets.com-7078");
		applianceDetail3.setApplianceState("ALIVE");
		applianceDetail3.setApplianceCores("20 (0 Used)");
		applianceDetail3.setApplianceMemory("6.6 GB (0.0 B Used)");
		
		applianceDetails.add(applianceDetail);
		applianceDetails.add(applianceDetail1);
		applianceDetails.add(applianceDetail2);
		applianceDetails.add(applianceDetail3);
		
		return applianceDetails;
	}
}
