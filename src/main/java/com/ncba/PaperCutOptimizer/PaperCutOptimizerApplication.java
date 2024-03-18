package com.ncba.PaperCutOptimizer;

import com.ncba.PaperCutOptimizer.Service.PaperCutOptimizer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaperCutOptimizerApplication {

	public static void main(String[] args) {
		String paper = "xoxoxoxxxoxxxoxxoooxxox";
		int largestN = PaperCutOptimizer.largestN(paper);
		System.out.println("Largest N: " + largestN);
	}

}
