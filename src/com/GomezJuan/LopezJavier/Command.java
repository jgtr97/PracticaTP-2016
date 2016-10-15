package com.GomezJuan.LopezJavier;

public class Command {
	private ENUM_COMMAND command;
	private ByteCode instruction;
	private int replace;
	
	public Command (ENUM_COMMAND enum_command, ByteCode instruction, int replace){
		this.command = enum_command;
		this.instruction =  instruction;
		this.replace =  replace;
	}
	
	public boolean execute(Engine engine){
		return true;
	}
}
