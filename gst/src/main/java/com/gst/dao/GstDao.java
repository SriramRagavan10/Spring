package com.gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gst.entity.Gst;
import com.gst.repository.GstRepository;

@Repository
public class GstDao {

	@Autowired
	GstRepository gstRepo;

	public String insertAll(List<Gst> gst) {
		gstRepo.saveAll(gst);
		return "All GST Data Save Successfull";
	}

	public Integer getTaxPercentageByHsn(long hsn) {
		return gstRepo.getTaxPercentageByHsn(hsn);
	}

}
