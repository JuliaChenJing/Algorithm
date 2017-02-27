public class StackFromArray {

	static int STACK_SIZE = 300;

	int[] buffer = new int[STACK_SIZE * 3];

	int[] stackPointer = { 0, 0, 0 }; // stack pointers to track top elem
	
	public static void main(  String [] args)
	{
		
	}

	void push(int stackNum, int value) {
		/*
		 * Find the index of the top element in the array + 1, and increment the
		 * stack pointer
		 */
		int index = stackNum * STACK_SIZE + stackPointer[stackNum] + 1;
		stackPointer[stackNum]++;
		buffer[index] = value;
	}

	int pop(int stackNum) {

		int index = stackNum * STACK_SIZE + stackPointer[stackNum];

		stackPointer[stackNum]--;
		int value = buffer[index];
		buffer[index] = 0;
		return value;
	}

	int peek(int stackNum) {
		int index = stackNum * STACK_SIZE + stackPointer[stackNum];
		return buffer[index];
	}

	boolean isEmpty(int stackNum) {
		return stackPointer[stackNum] == stackNum * STACK_SIZE;
	}
}
