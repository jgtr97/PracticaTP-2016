package com.GomezJuan.LopezJavier;

public class Engine {
	private ByteCodeProgram program;
	private boolean end;
	public Engine (){
		
	}
	
	public void start (){
		java.util.Scanner sc = new java.util.Scanner(System.in); 
		String cadenaComando = sc.nextLine();
		
		Command comando = CommandParser.parse(cadenaComando);
		if (comando.execute(this)){
			System.out.println("This is great");
		}
		else{
			System.out.println("Oh no, an error ocurred.");
		}
		
	}
	public void ejecutarhelp(){
		System.out.println("Comienza la ejecución de HELP");
		System.out.println("HELP: Muestra esta ayuda. \n"
				+ "QUIT: Cierra la aplicacion. \n"
				+ "RUN: Ejecuta el programa. \n"
				+ "NEWINST BYTECODE: Introduce una nueva instrucción al programa. \n"
				+ "RESET: Vacia el programa actual. \n"
				+ "REPLACE N: Reemplaza la instruccion N por la solicitada al usuario. \n");
	}
}
