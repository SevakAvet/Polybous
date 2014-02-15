package com.sevak_avet.Polybius;

import static com.sevak_avet.Polybius.CryptoUtils.*;

public class Encryption {
	private String encryptedText;

	public Encryption(String text) {
		findInArr(text);
	}

	public String getEncText() {
		return this.encryptedText;
	}

	private void findInArr(String text) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < text.length(); ++i) {
			res.append(charIn(text.charAt(i)));
		}
		
		this.encryptedText = res.toString();
	}

	private String charIn(char c) {
		StringBuilder res = new StringBuilder();
		
		for (int i = 0; i < key.length; ++i) {
			for (int j = 0; j < key[i].length; ++j) {
				if (key[i][j] == c) {
					return res.append(i).append(j).append(" ").toString();
				}
			}
		}
		
		return "";
	}
}