//package com.lmansfield.bookwebheroku;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//import org.springframework.stereotype.Service;
//
//import com.opencsv.CSVReader;
//
//
//@Service
//public class CSVService {
//	
//	private List<String[]> booksText = new ArrayList<String[]>();
//	private List<Book> books = new ArrayList<Book>();
//
//	
//	
//	public List<String[]> readDataFromCSV(String filename) {
//		
//		try {
//			Resource resource = new ClassPathResource(filename);
//			FileReader fileReader = new FileReader(resource.getFile());
//			CSVReader csvReader = new CSVReader(fileReader);
//			booksText = csvReader.readAll();
//		}
//		catch (FileNotFoundException e) {
//			System.out.println("File not found!");
//			e.printStackTrace();
//		}
//		
//		catch (Exception e) {
//			e.printStackTrace();
//		
//		} 
//		return booksText;
//	}
//
//	public List<Book> extractBooks(List<String[]> booksText){
//		String[] header = booksText.get(0);
//		int headerLen = header.length;
//		int authorInd=0;
//		int titleInd=0;
//		int ratingInd=0;
//		
//		for(int i=0; i<headerLen; i++) {
//			if(header[i].equals("Author")) {
//				authorInd = i;
//			}
//			if(header[i].equals("Title")) {
//				titleInd = i;
//			}
//			if(header[i].equals("My Rating")) {
//				ratingInd = i;
//			}
//		}
//		booksText.remove(0);
//		for(String[] bookDetails : booksText) {
//			if (!bookDetails[ratingInd].equals("0")){
//				Book book = new Book(bookDetails[titleInd], bookDetails[authorInd], bookDetails[ratingInd] );
//				books.add(book);
//			}
//		}
//
//		return books;
//	}
//	
//	public String testString() {
//		return "testString";
//	}
//
//}
