
public class Resolucion {
	public static void main(String[] args) {
	//	Almacenamiento almacenamiento=GestorFile.leer("./PreparacionPruebas/LotePrueba/Entrada/01_Enunciado.in");
	//	almacenamiento.resolver();
	//	GestorFile.escribir("./PreparacionPruebas/LotePrueba/SalidaEsperada/01_Enunciado.out",almacenamiento.getCantidadAplicacionesABorrar());
		
//		Almacenamiento almacenamiento=GestorFile.leer("./PreparacionPruebas/LotePrueba/Entrada/02_no_hay_espacio_disponible.in");
//		almacenamiento.resolver();
//		System.out.println(almacenamiento.getCantidadAplicacionesABorrar());
//		GestorFile.escribir("./PreparacionPruebas/LotePrueba/SalidaEsperada/02_no_hay_espacio_disponible.out",almacenamiento.getCantidadAplicacionesABorrar());
		
	//	Almacenamiento almacenamiento=GestorFile.leer("./PreparacionPruebas/LotePrueba/Entrada/03_eliminando_todas_apps.in");
     //	almacenamiento.resolver();
//		System.out.println(almacenamiento.getCantidadAplicacionesABorrar());
	//	GestorFile.escribir("./PreparacionPruebas/LotePrueba/SalidaEsperada/03_eliminando_todas_apps.out",almacenamiento.getCantidadAplicacionesABorrar());
		//GeneraFatiga.GenerarFatiga("./PreparacionPruebas/LotePrueba/Entrada/fatiga.in");
		
//		Almacenamiento almacenamiento=GestorFile.leer("./PreparacionPruebas/LotePrueba/Entrada/04_eliminando_unica_app.in");
//	     almacenamiento.resolver();
////			System.out.println(almacenamiento.getCantidadAplicacionesABorrar());
//			GestorFile.escribir("./PreparacionPruebas/LotePrueba/SalidaEsperada/04_eliminando_unica_app.out",almacenamiento.getCantidadAplicacionesABorrar());
//			//GeneraFatiga.GenerarFatiga("./PreparacionPruebas/LotePrueba/Entrada/fatiga.in");
			
		
		Almacenamiento almacenamiento=GestorFile.leer("./PreparacionPruebas/LotePrueba/Entrada/fatiga.in");
		System.out.println("app instalar "+almacenamiento.getAppInstalar().getMemoria());
		almacenamiento.resolver();
		System.out.println(almacenamiento.getCantidadAplicacionesABorrar());
		GestorFile.escribir("./PreparacionPruebas/LotePrueba/SalidaEsperada/fatiga.out",almacenamiento.getCantidadAplicacionesABorrar());
		
	}
}
