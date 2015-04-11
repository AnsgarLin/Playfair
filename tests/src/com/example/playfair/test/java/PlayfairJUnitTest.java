package com.example.playfair.test.java;

import static org.junit.Assert.assertEquals;

import com.example.playfair.main.PlayfairMain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlayfairJUnitTest extends PlayfairMain{
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetTable() {
		String key = " plA y%#& fAIr $exa#mPl$@e".toUpperCase();
		String table = getTable(key);
		System.out.println(table);
		assertEquals("PLAYFIREXMBCDGHKNOQSTUVWZ", table);
		
		String words = "@%H$i%de !#$the gold in the tree stump^$".toUpperCase();
		String info = getInfo(words);
		System.out.println(info);
		assertEquals("HI DE TH EG OL DI NT HE TR EX ES TU MP", info);
		
		String cipherText = getCiphertext(table, info);
		System.out.println(cipherText);
		assertEquals("BM OD ZB XD NA BE KU DM UI XM MO UV IF", cipherText);

		String plainText = getPlaintext(table, cipherText);
		System.out.println(plainText);		
	}

}
