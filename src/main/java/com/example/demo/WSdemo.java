package com.example.demo;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Practice;
@Controller
public class WSdemo {
	@RequestMapping("/preview")
	public @ResponseBody List<String> getSchemasService() {
		return Practice.getSchema();
	}
	@RequestMapping(path = "/preview/{schema}", method = RequestMethod.GET)
	public @ResponseBody List<String> getTablesService(@PathVariable String schema) {
		return Practice.getTables(schema);
	}
}
