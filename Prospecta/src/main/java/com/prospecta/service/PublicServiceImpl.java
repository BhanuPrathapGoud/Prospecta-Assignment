package com.prospecta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prospecta.model.PublicApi;
import com.prospecta.model.PublicApiDTO;
import com.prospecta.repository.PublicApiDao;

public class PublicServiceImpl implements PublicService{
	@Autowired
	PublicApiDao publicApiDao;
	@Override
	public String createData(PublicApi publicApi) {
		if(publicApiDao.findById(publicApi.getId()).isPresent()) {
			return "Data Already Crated";
		}else {
			publicApiDao.save(publicApi);
			return "Data Crated Sucessfull";
		}
		
	}

	@Override
	public List<PublicApi> getPublic(String categery) {
		
		return publicApiDao.findAllByCategory(categery);
	}

}
