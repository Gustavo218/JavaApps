package project;

import java.util.Collections;
import java.util.LinkedList;

public class Ordem {



	public static String canudo;
	public  String nome;
	private  String tel;
	private String rua;
	private int num;
	private String massa;
	private String massa2;
	private  String meat;
	private  String acomp1;
	private String acomp2;
	private String acomp3;
	private  String bebida;
	private  String can;
	
	public Ordem(String nome, String tel, String rua, int num, String massa, String massa2, String meat, String acomp1, String acomp2, String acomp3, String bebida){
		this.nome=nome;
		this.setTel(tel);
		this.setRua(rua);
		this.setNum(num);
		this.setMeat(meat);
		this.massa=massa;
		this.massa2=massa2;
		this.setAcomp1(acomp1);
		this.setAcomp2(acomp2);
		this.setAcomp3(acomp3);
		this.setBebida(bebida);
		this.setCan(can);
		
	}
	
	public enum massa {
		Arroz, Feijão, Macarrão
	}
	
	public Ordem() {
		LinkedList<String> carne = new LinkedList<>();
		{
			carne.add("Frango Grelhado");
			carne.add("Bife");
			carne.add("Frango Assado");
			carne.add("Filé mignon suíno");
			carne.add("Filé de Peixe");
			
		}
		Collections.sort(carne);
	
		carne.forEach((n) -> {System.out.println(n);});
	}

	


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRua() {
		return rua;
	}

	
	
	

	public void setRua(String rua) {
		this.rua = rua;
	}




	public int getNum() {
		return num;
	}




	public void setNum(int num) {
		this.num = num;
	}




	public String getMeat() {
		return meat;
	}
	
	public void setMeat (String meat) {
		this.meat=meat;
	}
	


	public String getAcomp1() {
		return acomp1;
	}




	public void setAcomp1(String acomp1) {
		this.acomp1 = acomp1;
	}




	public String getAcomp2() {
		return acomp2;
	}




	public void setAcomp2(String acomp2) {
		this.acomp2 = acomp2;
	}




	public String getAcomp3() {
		return acomp3;
	}




	public void setAcomp3(String acomp3) {
		this.acomp3 = acomp3;
	}




	public String getBebida() {
		return bebida;
	}




	public void setBebida(String bebida) {
		this.bebida = bebida;
	}




	public String getCan() {
		return can;
	}


	public void setCan(String can) {
		this.can = can;
	}
	



	@Override
	public String toString() {
		return "Nome : " + nome + "\nTelefone: " + tel + "\nEndereço: " + rua + "\nNúmero:" + num + "\nPrato: "+ massa + ", " +
				massa2 + ", "+ meat + ", " + acomp1 + ", " 
				+ acomp2 + ", " + acomp3 + "\nBebida: " + bebida;
	}




	
}

