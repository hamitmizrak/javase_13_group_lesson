package com.ecodation.a17.inner_class;

// Javada olan özellikler Innerclass
// 1 tane public vardır istediğimiz kadar
// class static olmaz class static olabilir

// içiçe classlar denilmektedir.
public class Ulke {
	private String ulkeAdi;
	
	public String getUlkeAdi() {
		return ulkeAdi;
	}
	
	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
	
	// iç class Sehir
	public class Sehir {
		private String sehirAdi;
		
		public String getSehirAdi() {
			return sehirAdi;
		}
		
		public void setSehirAdi(String sehirAdi) {
			this.sehirAdi = sehirAdi;
		}
		
		// iç class PlakaNo
		public class PlakaNo {
			private String plakaNumarasi;
			
			public String getPlakaNumarasi() {
				return plakaNumarasi;
			}
			
			public void setPlakaNumarasi(String plakaNumarasi) {
				this.plakaNumarasi = plakaNumarasi;
			}
			
		}
	}
	
}
