package com.gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gst.dao.GstDao;
import com.gst.entity.Gst;

@Service
public class GstService {

	@Autowired
	GstDao gstDao;

	public String insertAll(List<Gst> gst) {
		return gstDao.insertAll(gst);
	}

	public Integer getTaxPercentageByHsn(long hsn) {
		return gstDao.getTaxPercentageByHsn(hsn);
	}

}
