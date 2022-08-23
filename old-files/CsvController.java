//
//package com.lmansfield.bookwebheroku;
//
//import java.io.FileReader;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//
//
//@Controller
//public class CsvController {
//		
//		@Autowired
//		CSVService service;
//
////		
////		//Constructor
////		public void CsvController(String filename) {
////			this.filename = filename;
////		}
//		
//		//Methods
//		@GetMapping(value = "/books")
//		public String showBooks(ModelMap model) {
//			String filename = "goodreads_library_export.csv";
//			List<Book> books = service.extractBooks(service.readDataFromCSV(filename));
//			model.addAttribute("books", books);
//
//			return "welcome";
//		}
//
//}
