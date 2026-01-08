package es.cursojava.ejercicioCalculadora.service;

import es.cursojava.ejercicioCalculadora.dto.CalculadoraDTO;

public class CalculadoraService {

	public String calcular(CalculadoraDTO calculadoraDTO) {
		String resultado = "";
		switch (calculadoraDTO.getOp()) {
		case "suma":
			resultado = "Resultado suma: " + (calculadoraDTO.getNum1() + calculadoraDTO.getNum2()); 
			break;
		case "resta":
			resultado = "Resultado resta: " + (calculadoraDTO.getNum1() - calculadoraDTO.getNum2()); 
			break;
		case "multiplicacion":
			resultado = "Resultado multiplicación: " + (calculadoraDTO.getNum1() * calculadoraDTO.getNum2()); 
			break;
		default:
			resultado = "Opcion no valida";
			break;
		}
		return resultado;
	}
}
