package com.example.mynewapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
//	@Autowired
//	private Country newCon;
	
	
	
//	@CrossOrigin
//	@RequestMapping("/getmovies")
//	public List<Movies> getMovies()
//	{
//		return Arrays.asList(
//				new Movies("M01","Avenger","This is avenger movie"),
//				new Movies("M02","Krish","This is Krish movie"),
//				new Movies("M01","DDLJ","This is DDLJ movie")
//				);
//	}
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.GET,value="/getdata")
	public List<Country> getdata(@RequestParam String cName) throws Exception
	{
		String url = "https://www.worldometers.info/coronavirus/country/"+cName+"/";
		Document doc = Jsoup.connect(url).get();
//		System.out.println(doc.title());
		Elements elements = doc.select("#maincounter-wrap");
//		System.out.println(elements.html());
		ArrayList<Country> l1= new ArrayList<>();
		elements.forEach((e)->{
			String countryName = e.select("h1").text();
			String casesCount = e.select(".maincounter-number>span").text();
			l1.add(new Country(countryName,casesCount));
		});
		return  l1;
	}
}	
