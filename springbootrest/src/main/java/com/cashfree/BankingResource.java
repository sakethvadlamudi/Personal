package com.cashfree;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

@RestController
public class BankingResource {

	static String fileName;
	static List<String[]> allData;

	static {
		fileName = "IFSC.csv";
		try {
			FileReader fileReader = new FileReader(fileName);
			CSVReader csvReader = new CSVReader(fileReader);
			allData = csvReader.readAll();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO Exception");
			e.printStackTrace();
		} catch (CsvException e) {
			System.out.println("CSV Exception");
			e.printStackTrace();
		}
	}

	@RequestMapping("getBanksByCityAndState")
	HashSet<String> getBanksByCityAndState(
			@RequestParam(name = "city", required = true, defaultValue = "GREATER MUMBAI") String city,
			@RequestParam(name = "state", required = true, defaultValue = "MAHARASHTRA") String state) {

		HashSet<String> requiredBanks = new HashSet<>();

		for (String[] row : allData) {
			// state is 5th column and city is 10th column
			if (row[5].toLowerCase().equalsIgnoreCase(state.toLowerCase())
					&& row[10].toLowerCase().equalsIgnoreCase(city.toLowerCase())) {
				requiredBanks.add(row[0]);
			}
		}

		return requiredBanks;

	}

	@RequestMapping("getBanksByPrefix")
	HashSet<String> getBanksByPrefix(
			@RequestParam(name = "prefix", required = true, defaultValue = "ABHYU") String prefix) {

		HashSet<String> requiredBanks = new HashSet<>();

		for (String[] row : allData) {
			// state is 5th column and city is 10th column
			if (row[0].toLowerCase().startsWith(prefix.toLowerCase())) {
				requiredBanks.add(row[0]);
			}
		}

		return requiredBanks;

	}

	@RequestMapping("getBanksByCityAndPrefix")
	HashSet<String> getBanksByCityAndPrefix(
			@RequestParam(name = "city", required = true, defaultValue = "GREATER MUMBAI") String city,
			@RequestParam(name = "prefix", required = true, defaultValue = "ABHYU") String prefix) {

		HashSet<String> requiredBanks = new HashSet<>();

		for (String[] row : allData) {
			// state is 5th column and city is 10th column
			if (row[10].equalsIgnoreCase(city) && row[0].toLowerCase().startsWith(prefix.toLowerCase())) {
				requiredBanks.add(row[0]);
			}
		}

		return requiredBanks;
	}

}
