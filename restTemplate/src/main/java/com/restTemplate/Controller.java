package com.restTemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping(value = "/getHi")
	public String getHi() {
		return "கண்ணுக்குள்ள கத்தி வச்சி,\n" + "கனவுக்குள்ள நீயும் வந்தா,\n" + "\n" + "வாராதே சந்தோஷமே.\n" + "\n"
				+ "\n" + "விண்ணில் உள்ள மீன் எடுத்து," + "\n" + "விரல் இடுக்கில் போட்டு விட்டா," + "\n"
				+ "சேராதே பெரும் துன்பமே." + "\t" + "\n" + "கண்ணீர் தீராத மேகம்," + "\n" + "கடலுக்குள்ள காதல் முழ்குதே."
				+ "\n" + "வானம் பாராத சோகம்," + "\n" + "நிலவுக்குள்ள நீரும் ஊருதே." + "\n" + "\n" + "வாழ்கின்ற தெய்வம்,"
				+ "\n" + "குறை தீரா பிழை ஆச்சோ.";
	}

}
