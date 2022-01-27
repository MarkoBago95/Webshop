package com.webshop.sample.service;


import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;


public class HnbApi {

	Double currency;
	public Double getCurreny()  {
		
    	final String uri = "https://api.hnb.hr/tecajn/v1?valuta=EUR";
    	RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
       
        JSONArray jsonArr = new JSONArray(result);

        for (int i = 0; i < jsonArr.length(); i++)
        {
            JSONObject jsonObj = jsonArr.getJSONObject(i);
           
            String currString=(String) jsonObj.get("Srednji za devize");
            currency=Double.parseDouble(currString.replace(',', '.'));
            System.out.println(currency);
            
        }
        return currency;
		
	}
}
