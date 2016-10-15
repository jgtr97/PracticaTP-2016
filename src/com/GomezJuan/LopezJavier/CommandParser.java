package com.GomezJuan.LopezJavier;

public class CommandParser {
	
	public static Command parse (String line){
		Command comando =  null;
		line = line.toLowerCase();
		switch (line){
		case "help":
			comando = new Command(ENUM_COMMAND.HELP, null, 0);
			return comando;
		case "quit":
			comando = new Command(ENUM_COMMAND.QUIT, null, 0);
			return comando;
		case "newinst": //Hay que arreglar esta mierda
			comando = new Command(ENUM_COMMAND.NEWINSTBC, null, 0);
			return comando;
		case "run":
			comando = new Command(ENUM_COMMAND.RUN, null, 0);
			return comando;
		case "reset":
			comando = new Command(ENUM_COMMAND.RESET, null, 0);
			return comando;
		case "replace":
			comando = new Command(ENUM_COMMAND.REPLACEN, null, 0);
			return comando;
		}
		
		return comando;
	}
}
