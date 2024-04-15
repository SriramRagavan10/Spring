package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.jetty.client.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "/admin")
public class DemoController {
	@GetMapping(value = "/getHi")
	public ResponseEntity<String> getHello() {
		return new ResponseEntity<String>("Hello World", HttpStatus.ACCEPTED);
	}

	@GetMapping(value = "/add/{num1}/{num2}")
	public int add(@PathVariable int num1, @PathVariable int num2) {
		return num1 + num2;
	}

	@GetMapping(value = "/reverse/{name}")
	public ResponseEntity<String> rever(@PathVariable String name) {
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		return ResponseEntity.ok(rev);
	}

	@GetMapping(value = "/pal/{val}")
	public String same(@PathVariable String val) {
		String temp = "";
		for (int i = 0; i < val.length(); i++) {
			temp = val.charAt(i) + temp;
		}
		if (val.equals(temp)) {
			return "Palindrome";
		} else {
			return "Not Palindrome";
		}
	}

	@GetMapping(value = "/prime/{num}")
	public String checkPrime(@PathVariable int num) {
		boolean a = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				a = false;
			}
		}
		if (a == true) {
			return num + " is Prime";
		} else {
			return num + " is Not Prime";
		}
	}

	@GetMapping(value = "/counting/{no}")
	public int countPrime(@PathVariable int no) {
		int c = 0;
		for (int i = 1; i < no; i++) {
			int co = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					co++;
				}
			}
			if (co == 0) {
				c++;
			}
		}
		return c;
	}

	@GetMapping(value = "/div/{num}")
	public List<Integer> divisible(@PathVariable int num) {
		List<Integer> n = new ArrayList<>();
		for (int i = 1; i < num; i++) {
			if (i % 7 == 0) {
				n.add(i);
			}
		}
		return n;
	}

	@GetMapping(value = "/element/{word}")
	public Map<Character, Long> elements(@PathVariable String word) {
		Map<Character, Long> n = word.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return n;
	}

	@GetMapping(value = "/nondup")
	public String nonDup(@RequestParam(value = "word", defaultValue = "") String word) {
		if (word.equals("")) {
			return "No Word";
		}
		Map<Character, Long> n = word.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<Character, Long> wo = n.keySet().stream().filter(x -> n.get(x) == 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<Long> ch = wo.values().stream().collect(Collectors.toList());
		List<Character> c = wo.keySet().stream().collect(Collectors.toList());
		return c + " = " + ch;

	}

	@GetMapping(value = "/dup/{name}")
	public Map<Integer, String> dup(@PathVariable String name) {
		Map<Integer, String> s = new HashMap<>();
		String[] name1 = name.split("");
		int c = 0;
		for (Integer i = 0; i < name1.length; i++) {
			Integer count = 1;
			for (Integer j = i + 1; j < name1.length; j++) {
				if (name1[i].equals(name1[j])) {
					count++;
				}
			}
			if (count > 1) {
				s.put(count, name1[i]);
			}
		}
		return s;
	}

	@GetMapping(value = "/listProduct")
	public String name(@RequestParam String name) {
		if (name.equals("")) {
			return "No Word";
		}
		return name;
	}

	@GetMapping("/last/{name}")
	public String mam(@PathVariable String name) {
		return name;
	}
}
