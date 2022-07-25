package com.example.SpringMyself;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySelf {
	
	@GetMapping("/yes")
	public  String mySelf() {
		// TODO Auto-generated method stub
		System.out.println("Done !!!");
		String s = "<h1> Okay My name is Vinayak Ankush Suryawanshi </h1> I have enrolled in Anudip Foundation Java Course. Batch No:ANPC1496s";

		return s;
	}

}
