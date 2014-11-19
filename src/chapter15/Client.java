package chapter15;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class Client {

    public static void main(String[] args) {
        // Create a radio and its up/down command objects
        Radio radio = new Radio();
        radio.on();
        Command volumeUpCommand = new VolumeUpCommand(radio);
        Command volumeDownCommand = new VolumeDownCommand(radio);

        // Create an electric window and its up/down command objects
        ElectricWindow window = new ElectricWindow();
        Command windowUpCommand = new WindowUpCommand(window);
        Command windowDownCommand = new WindowDownCommand(window);

        // Create a speech recognition object
        SpeechRecogniser speechRecogniser = new SpeechRecogniser();

        System.out.println("Speech recognition controlling the radio");
        speechRecogniser.setCommands(volumeUpCommand, volumeDownCommand);
        speechRecogniser.hearUpSpoken();
        speechRecogniser.hearUpSpoken();
        speechRecogniser.hearUpSpoken();
        speechRecogniser.hearDownSpoken();

        System.out.println("Speech recognition will now control the window");
        speechRecogniser.setCommands(windowUpCommand, windowDownCommand);
        speechRecogniser.hearDownSpoken();
        speechRecogniser.hearUpSpoken();
    }

}
