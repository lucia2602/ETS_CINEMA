package Tema5;

import javax.swing.JOptionPane;

public class Act_Cine {

	public static void main(String[] args) {

		//DECLARACION DE VARIABLES
		final int Total_asientos = 0; //Variable constante entera
		int menu; //variable entera
		
		Act_Cinema_Booking sala=new Act_Cinema_Booking(Total_asientos);
		
		boolean flag=true; //Variable logica
		
		//BUCLE
		do {
			do {
				//Mensaje de menu
				menu=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el nº que desea consultar: "
						+ "\n 1_Reservar asientos: "
						+ "\n 2_Cancelar la reserva: "
						+ "\n 3_Consultar cuantos asientos libres quedan: "
						+ "\n 4_EXIT"));
				
			} while (menu !=1 && menu !=2 && menu !=3 && menu !=4);
			
			switch (menu) {
			
			//RESERVA
			case 1:
				if (sala.consultas()>0) {
					
				//Mensajes de reserva
				int Asientos_reservados=Integer.parseInt(JOptionPane.showInputDialog("¿CUANTOS ASIENTOS QUIERE RESERVAR?"));
				sala.reservas(Asientos_reservados);
				JOptionPane.showMessageDialog(null, "HA RESERVADO " + sala.consultas() + "ASIENTOS EN TOTAL");
				
				} else
					JOptionPane.showInternalMessageDialog(null, "SIN ASIENTOS DISPONIBLES, VUELVA EN OTRO MOMENTO");
			break;
			
			//CANCELAR RESERVA
			case 2:
				if (sala.consultas()>Total_asientos) {
					
					//Mensajes de cancelacion
					int Asientos_cancelados=Integer.parseInt(JOptionPane.showInputDialog("¿DESEA CANCELAR LA RESERVA?"));
					sala.cancelacion(Asientos_cancelados);
					JOptionPane.showMessageDialog(null, "HAS CANCELADO " + sala.consultas() + "ASIENTOS EN TOTAL");
					
					} else
						JOptionPane.showInternalMessageDialog(null, "SIN RESERVAS, VUELVA EN OTRO MOMENTO");
			break;
				
			//CONSULTAR
			case 3:
				JOptionPane.showMessageDialog(null, "HAY " + sala.consultas() + " ASIENTOS LIBRES");
			break;
				
			//SALIR
			case 4:
				JOptionPane.showInternalMessageDialog(null, "HA SALIDO DE LA APLICACION, VUELVA PRONTO");
				flag=false;
			break;
			}
			
		//SALIR DEL MENU
		} while (flag==true);
	}
}
