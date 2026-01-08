package es.cursojava.ejercicioCalculadora.dto;

public class CalculadoraDTO {
	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	private String op;
	private int num1;
	private int num2;
	
	public CalculadoraDTO(String op, int num1, int num2) {
		super();
		this.op = op;
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	
	

}
