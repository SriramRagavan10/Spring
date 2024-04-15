package com.gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gst.entity.Gst;
import com.gst.service.GstService;

@RestController
@RequestMapping(value = "/gst")
public class GstController {

	@Autowired
	GstService gstSer;

	@PostMapping(value = "/insertAll")
	public String insertAll(@RequestBody List<Gst> gst) {
		return gstSer.insertAll(gst);
	}

	@GetMapping(value = "/getTaxPercentage/{hsn}")
	public Integer getTaxPercentageByHsn(@PathVariable long hsn) {
		return gstSer.getTaxPercentageByHsn(hsn);
	}

}
