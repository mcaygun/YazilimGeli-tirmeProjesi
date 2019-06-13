package com.medipol.yazilimaraclari.RestAPIOrnek;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.medipol.yazilimaraclari.RestAPIOrnek.OgrenciRESTAPI.Ogrenci;

public class ProjeTest {
	
	@Test
	public void OgrenciEkle()
	{
	OgrenciRESTAPI TestEkle=new OgrenciRESTAPI();
	Ogrenci sonuc=TestEkle.ekle(new Ogrenci("Ayse",21));
	assertEquals("Ayse",21,sonuc);
	}
}
