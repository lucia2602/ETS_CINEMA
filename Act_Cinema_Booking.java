package Tema5;

public class Act_Cinema_Booking {

		//DECLARACION DE VARIABLES
		private int numAsientosFree; //Variable entera
		private final int numAsientosCinema; //Variable constante entera
		
		//MODIFICADORES
		public Act_Cinema_Booking(int asientos) {
			this.numAsientosCinema=asientos;
			this.numAsientosFree=this.numAsientosCinema;
		}
		
		public int consultas() {
			return this.numAsientosFree;
		}
		
		//Calculo de los asientos que quedan
		//Resta
		public void reservas(int N_asientos) {
			this.numAsientosFree-=N_asientos;
		}
		
		//Suma
		public void cancelacion(int N_asientos) {
			this.numAsientosFree+=N_asientos;
		}

}
