package com.GomezJuan.LopezJavier;

public enum ENUM_COMMAND {
	//TODO Poner nombres correctos.
	HELP(4564),
	QUIT (343),
	NEWINSTBC (898),
	RUN (456546),
	RESET (45654654),
	REPLACEN (563542);
	
private final int numero;
	
	ENUM_COMMAND (int numero){
		this.numero =  numero;
	}
	
	public int getEnumeracion (){
		return this.numero;
	}
	public String ToString (){
		return toString();
	}
}
