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
		
		Decryption deс = new Decryption("16 50 42 35 38 52 68 66 46 42 50 72"); // Привет, мир!
		System.out.println("Decrypted: " + deс.getDescText());
	}
}
