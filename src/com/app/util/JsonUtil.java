package com.app.util;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class JsonUtil {

	public String objectToJson(Object obj){
		String json=null;
		
		try{
			ObjectMapper om=new ObjectMapper();
			json=om.writeValueAsString(obj);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return json;
	}
	
	public Object jsonToObject(String json,Class cls){
		Object obj=null;
			try{
				ObjectMapper om=new ObjectMapper();
				obj=om.readValue(json, cls);
			}catch(Exception e){
				e.printStackTrace();
				
			}
		
		return obj;
	}
}


