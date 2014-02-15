package com.sevak_avet.Polybius;

import static com.sevak_avet.Polybius.CryptoUtils.*;

public class Decryption {
	public String inputText;
	public String decryptedText;

	public Decryption(String text) {		
		delAllSpace(text);
		decrypt(this.inputText);
	}

	public String getDescText() {
		return this.decryptedText;
	}

	private void delAllSpace(String s) {
		this.inputText = s.replaceAll(" ", "");
	}

	private void decrypt(String s) {
		StringBuilder res = new StringBuilder();
		int x, y;

		for (int i = 0; i < s.length(); ++i) {
			if (i % 2 == 0) {
				x = Integer.parseInt(String.valueOf(s.charAt(i)));
				y = Integer.parseInt(String.valueOf(s.charAt(i + 1)));

				res.append(key[x][y]);
			}
		}

		this.decryptedText = res.toString();
	}

}
