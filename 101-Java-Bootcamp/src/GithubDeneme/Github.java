package GithubDeneme;

public class Github {

	public static void main(String[] args) {
	
		Musteri musteri1=new Musteri("Deniz","Yıldırım", "05347894569" , "denizyilmaz@gmail.com");
		
		musteri1.MerhabaDe();
		musteri1.musteriTanıt();
		
		Musteri musteri2=new Musteri("Aysun","Yazıcı","05553269887","aysunyazici@gmail.com");
		
		musteri2.MerhabaDe();
		musteri2.musteriTanıt();
		
	}

}
