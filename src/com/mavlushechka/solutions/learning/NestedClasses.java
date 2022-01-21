package com.mavlushechka.solutions.learning;

public class NestedClasses {
	public static void main(String[] args) {
		Car car = new Car("Nexia");
		car.beep();
		car.showVoiceControllerInfo();
	}
}

class Car {
	public final String name;

	Car(String name) {
		this.name = name;
	}

	public void beep() {
		VoiceController voiceController = new VoiceController();
		voiceController.makeVoice();
	}

	public void showVoiceControllerInfo() {
		System.out.println(new VoiceController().name);
	}

	class VoiceController {
		public final String name = "FDSOI-3";

		private void makeVoice() {
			System.out.println(name + ": Beep!");
		}
	}
}
