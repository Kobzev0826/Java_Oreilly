package MusicChapter11;

import javax.sound.midi.MidiSystem;

import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
    public static void play()  {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();// ОБъект синтезирует "композицию" из информации в формате MIDI
            System.out.println("Синтезатор был создан");
        }catch(MidiUnavailableException e){
            System.out.println(e.getMessage());
        }

    }

    public static void main (String [] args) {
        MusicTest1.play();
    }



}
