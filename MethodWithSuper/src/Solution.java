import java.util.*;
import java.io.*;

class BiCycle {
	 String defineMe() {
		return "a vehicle with pedals.";
	}

}

class MotorCycle extends BiCycle {
	 String defineMe() {
		return "a cycle with an engine.";
	}

	MotorCycle() {
		System.out.println("Hello I am a motorcycle, I am " + defineMe());
		String temp = defineMe(); 
		System.out.println("My ancestor is a cycle who is " + temp);
	}

}
//uruchom aplikacj�, sprawd� co jest �le i popraw b��d
class Solution {
	public static void main(String[] args) {
		MotorCycle m = new MotorCycle();
	}
}