package instruction;

import processor.Processor;

public class InstructionLit implements Instruction {

	private int value;
	
	public InstructionLit(int value) {
		this.value = value;
	}
	
	public void exec() {
		Processor.stackPush(value);
	}
	
	public String toString() {
		return "instruction lit : "+value;
	}

}
