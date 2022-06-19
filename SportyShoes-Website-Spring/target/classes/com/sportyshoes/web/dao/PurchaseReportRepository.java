package com.sportyshoes.web.dao;

import java.util.List;


import com.sportyshoes.web.model.*;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class PurchaseReportRepository {

	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@SuppressWarnings("deprecation")
	public List<PurchaseReport> getReport(){
		
		@SuppressWarnings("unchecked")
		List<PurchaseReport> report=(List<PurchaseReport>) hibernateTemplate.find("from PurchaseReport order by reportProductName,reportDate");
		
		return report;
	}
	
}