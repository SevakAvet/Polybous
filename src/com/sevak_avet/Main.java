package com.sevak_avet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.sevak_avet.Polybius.Decryption;
import com.sevak_avet.Polybius.Encryption;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Encryption enc = new Encryption(reader.readLine());
		System.out.println("Encrypted: " + enc.getEncText());
		
		Decryption deс = new Decryption(reader.readLine());
		System.out.println("Decrypted: " + deс.getDescText());
	}
}
