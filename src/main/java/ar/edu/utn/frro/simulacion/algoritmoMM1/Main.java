package ar.edu.utn.frro.simulacion.algoritmoMM1;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			Reporte reporte = new Simulacion(100000).iniciarSimulacion();
			reporte.printReportToCSVFile("reporte" + i + ".csv");
		}
	}

}
