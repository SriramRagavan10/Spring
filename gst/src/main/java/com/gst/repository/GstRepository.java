package com.gst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gst.entity.Gst;

public interface GstRepository extends JpaRepository<Gst, Integer> {

	@Query(value = "select g.taxPercentage from Gst g where g.hsn=:hsn")
	public Integer getTaxPercentageByHsn(long hsn);

}
