package com.prospecta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prospecta.model.PublicApi;
import com.prospecta.service.PublicService;

@RestController
public class PublicController {
	@Autowired
	PublicService publicService;
	@PostMapping("/public")
	public String createData(@RequestBody PublicApi publicApi) {
		return publicService.createData(publicApi);
		
	}
	@GetMapping("/public/{categery}")
	public List<PublicApi> getPublic(@PathVariable String categery){
		return publicService.getPublic(categery);
		
	}
}
