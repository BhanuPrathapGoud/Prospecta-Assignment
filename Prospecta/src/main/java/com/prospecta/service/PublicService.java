package com.prospecta.service;

import java.util.List;

import com.prospecta.model.PublicApi;
import com.prospecta.model.PublicApiDTO;

public interface PublicService {
	public String createData(PublicApi publicApi);
	public List<PublicApi> getPublic(String categery);
}
