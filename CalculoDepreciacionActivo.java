package CalculoDepreciacionActivos;
import java.util.Scanner;
public class CalculoDepreciacionActivo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			double CostoActivo, Valordesecho, VidaUtil,VidaUtilp,Vactivo,Vlibros =0, nose=0, Vactivo1 = 0,suma=0, depreAnual,dacumulada,CuoAmort;
			String Nempresa, adq;
			String nmes = null;
			int entrada1, entrada2, metodo, dia, mes, año;
		
			
			Scanner n=new Scanner(System.in);
			
			System.out.println("******CALCULO DE DEPRECIACION*****");
			System.out.println("Bienvenido a nuestro programa, done nos  especializamos en el calculo de la depreciacion...");
			
			System.out.println("Como se llama la empresa?:");
			Nempresa=n.next();
			
			
			System.out.println("Que adquirio la empresa?:");
			adq=n.next();
			
			
			
			
		do {	
			System.out.println("1.De Edificios\n2. De Equipo de trasporte\n3. De Maquinaria y Equipo\nEn que categoria se encuentra la adquisicion?\n ");
			entrada1=n.nextInt();
			if(entrada1<=0 || entrada1>3) {System.out.println("Error, seleccione una opcion correcta");}
		}while(entrada1<=0 || entrada1>3);
		
			switch(entrada1) {
			
			case 1:
				
				System.out.println("1. Industriales\n2. Comerciales\n3. Residencia del propietario destinada ala explotacion agropecuaria\n4. Instalaciones Fijas en explotacion agropecuaria\n5. Para los Edificios de alquiler\n Dentro de que clasificasion se encuentra?");
				entrada2=n.nextInt();
				
				
				
				if(entrada2==1) {
					
					
					
					System.out.println("En que fecha lo adquirio?:");
					do {	
						System.out.println("Dia: ");
						dia=n.nextInt();
						if(dia<0 || dia>31) {System.out.println("Error, digite el dato correcto");}
					}while(dia<0 || dia>31);
						
					do {	
						System.out.println("Mes: ");
						mes=n.nextInt();
						if(mes<0 || mes>12) {System.out.println("Error, digite el dato correcto");}
					}while(mes<0 || mes>12);
					
					switch(mes) {
					
					case 1: nmes = "Enero";
					break;
					case 2: nmes="Febrero";
					break;
					case 3: nmes="Marzo";
					break;
					case 4: nmes="Abril";
					break;
					case 5: nmes="Mayo";
					break;
					case 6: nmes="Junio";
					break;
					case 7: nmes="Julio";
					break;
					case 8: nmes="Agosto";
					break;
					case 9: nmes="Septiembre";
					break;
					case 10: nmes="Octubre";
					break;
					case 11: nmes="Noviembre";
					break;
					case 12: nmes="Diciembre";
					break;
					
					}
					
				  do {
					  System.out.println("Anio: ");
					  año=n.nextInt();
					  if(año<0) {System.out.println("Error, digite un dato correcto");}
				  }while(año<0);
				  
				  
				  do {
				      System.out.println("En cuanto adquirio el  Activo? ");
				       Vactivo=n.nextFloat();
				       if(Vactivo<0) {System.out.println("Error,el acivo no puede ser un valor negativo intentelo denuevo");}
				     }while(Vactivo<0);
				  
				  do {
				      System.out.println("Cual es su valor de desecho o residual? ");
				      Valordesecho=n.nextDouble();
				      if(Valordesecho<0) {System.out.println("Error, No se aceptan datos negativos");}
				  }while(Valordesecho<0);
				  
				  do {
				      System.out.println("Cuato anios de vida util tiene? (Max 10anios)");
				      VidaUtil=n.nextDouble();
				      if(VidaUtil<=0 || VidaUtil>10) {System.out.println("Error, No se aceptan datos negativos");}
				  }while(VidaUtil<=0 || VidaUtil>10);
				  
				  do {
				      System.out.println("Cuato tiene de vida util en unidades producidas? (Max 10anios)");
				      VidaUtilp=n.nextDouble();
				      if(VidaUtilp<=0 || VidaUtil>100000) {System.out.println("Error, No se aceptan datos negativos");}
				  }while(VidaUtilp<=0 || VidaUtil>100000);
				  
				  
				  do {
				      System.out.println("1. Metodo de Linea Recta: \n2. Metodo de la suma de los digitos por anio: \n3. Metodo de las unidades producidas: \n4. Metodo de reduccion del saldo: \n Por cual metodo desea Calcular la Depreciacion?: \n");
				      metodo=n.nextInt();
				      if(metodo<=0 || metodo>4) {System.out.println("Error, Seleccione una opcion correcta");}
				  }while(metodo<=0 || metodo>4);
				  
				  
				  switch(metodo) {
				  
				  case 1: 
					  
					  System.out.println("_________________________________");
					  System.out.println(" ");
					  System.out.println("******Metodo de linea Recta******");
					  System.out.println("_________________________________");
						
						//("cuota de amortizacion
						
						CuoAmort = (Vactivo/VidaUtil);
						
						//depreciacion Anual
						depreAnual=(Vactivo-Valordesecho)/VidaUtil;
				
						System.out.println("------------------------");
						System.out.println("Depreciacion Acumulada: ");
						System.out.println("------------------------");
						
						for (int i = 1; i <= VidaUtil; i++) {
						
							suma = suma+depreAnual;
							
							System.out.println((suma));
						}
					
						System.out.println("------------------");
						System.out.println("Valor en  libros: ");
						System.out.println("------------------");
						
				
						nose=Vactivo;
						
						for (int i = 0; i < VidaUtil; i++) {
							
							 Vlibros = (Vactivo-depreAnual);
							 Vactivo = Vlibros;
							 
							 System.out.println(Vactivo);
						}
					 		  
					  System.out.println("____________________________________________________________________________________________________________");
					  System.out.println("- La Empresa "+Nempresa+" adquiere el "+dia+" de "+nmes+" del año "+año+", un "+adq+" por un valor de C$"+nose+", se\nespera que el edificio permanezca en servicio por "+VidaUtil+" años y durante ese tiempo los funcionarios\nde la  empresa estimaron que el final de su vida residual sera C$"+Valordesecho+" se espera que su Cuota de\nAmortizacion Anual sea de C$"+CuoAmort+", la mensual "+(CuoAmort/12)+", tambien se estima que su Depreciacion Anual\nsea de "+depreAnual+" y su cuota Anual a deducir sea "+(Vactivo*10)/100);
					  System.out.println("____________________________________________________________________________________________________________");
				  
				  break;
				  
				  case 2: 
					  
					  System.out.println("_____________________________________________________");
					  System.out.println(" ");
					  System.out.println("******Metodo de la suma de los digitos por anio******");
					  System.out.println("_____________________________________________________");
					  
					  CuoAmort = (Vactivo/VidaUtil);
					  
					  
					  //depreciacion Anual
						depreAnual=(Vactivo-Valordesecho)/VidaUtilp;
				
						System.out.println("------------------------");
						System.out.println("Depreciacion Acumulada: ");
						System.out.println("------------------------");
						
						for (int i = 1; i <= VidaUtil; i++) {
						
							suma = suma+depreAnual;
							
							System.out.println((suma));
						}
					
						System.out.println("------------------");
						System.out.println("Valor en  libros: ");
						System.out.println("------------------");
						
						
						nose=Vactivo;
						
						for (int i = 0; i < VidaUtil; i++) {
							
							 Vlibros = (Vactivo-depreAnual);
							 Vactivo = Vlibros;
							 
							 System.out.println(Vactivo);
							 
							 
						}
					  
						  System.out.println("____________________________________________________________________________________________________________");
						  System.out.println("- La Empresa "+Nempresa+" adquiere el "+dia+" de "+nmes+" del año "+año+", un "+adq+" por un valor de C$"+nose+", se\nespera que el edificio permanezca en servicio por "+VidaUtil+" años y durante ese tiempo los funcionarios\nde la  empresa estimaron que el final de su vida residual sera C$"+Valordesecho+" se espera que su Cuota de\nAmortizacion Anual sea de C$"+CuoAmort+", la mensual "+(CuoAmort/12)+", tambien se estima que su Depreciacion Anual\nsea de "+depreAnual+" y su cuota Anual a deducir sea "+(Vactivo*10)/100);
						  System.out.println("____________________________________________________________________________________________________________");

					  break;
					  
				  case 3:
					  
					  
					  System.out.println("_____________________________________________________");
					  System.out.println(" ");
					  System.out.println("******Metodo de la suma de los digitos por anio******");
					  System.out.println("_____________________________________________________");
					  
					  CuoAmort = (Vactivo/VidaUtil);
					  
					  
					  //depreciacion Anual
					  
					  for (int i = 1; i <= VidaUtil; i++) {
							
							suma = VidaUtil-i;
							VidaUtil=suma;
							
							System.out.println((suma));
						}
					  
					  
					  
						depreAnual=(Vactivo-Valordesecho)+(VidaUtil);
				
						System.out.println("------------------------");
						System.out.println("Depreciacion Acumulada: ");
						System.out.println("------------------------");
						
						for (int i = 1; i <= VidaUtil; i++) {
						
							suma = suma+depreAnual;
							
							System.out.println((suma));
						}
					
						System.out.println("------------------");
						System.out.println("Valor en  libros: ");
						System.out.println("------------------");
						
						
						nose=Vactivo;
						
						for (int i = 0; i < VidaUtil; i++) {
							
							 Vlibros = (Vactivo-depreAnual);
							 Vactivo = Vlibros;
							 
							 System.out.println(Vactivo);
							 
							 
						}
					  
						  System.out.println("____________________________________________________________________________________________________________");
						  System.out.println("- La Empresa "+Nempresa+" adquiere el "+dia+" de "+nmes+" del año "+año+", un "+adq+" por un valor de C$"+nose+", se\nespera que el edificio permanezca en servicio por "+VidaUtil+" años y durante ese tiempo los funcionarios\nde la  empresa estimaron que el final de su vida residual sera C$"+Valordesecho+" se espera que su Cuota de\nAmortizacion Anual sea de C$"+CuoAmort+", la mensual "+(CuoAmort/12)+", tambien se estima que su Depreciacion Anual\nsea de "+depreAnual+" y su cuota Anual a deducir sea "+(Vactivo*10)/100);
						  System.out.println("____________________________________________________________________________________________________________");

					  break;
				  
				  case 4:
					  
					  
					  
					  
					  break;
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
				  }
				  	
				
				}else if(entrada2==2) {
					
					
				
			
			
			}
			
			
			}

	


	}

}
