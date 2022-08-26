package MusicChapter11;

import javax.sound.midi.*;

public class MusicTest1 {
    public static void play()  {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();// ОБъект синтезирует "композицию" из информации в формате MIDI
            System.out.println("Синтезатор был создан");
            sequencer.open();

            Sequence seq = new Sequence(Sequence.PPQ,4); // конструктор синтезатора

            Track track = seq.createTrack();//Запрос трека у последовательности
            //-------------------------------------------------
            //-----------помещение в трек MIDI событий-------------
            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,44,100);
            MidiEvent noteOn = new MidiEvent(a,1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            a.setMessage(128,1,44,100);
            MidiEvent noteOff = new MidiEvent(b,16);
            track.add(noteOff);
            //-----------------------------------------------------------------
            sequencer.setSequence(seq); // передача последовательности синтезатору

            sequencer.start();

        }catch(MidiUnavailableException e){
            System.out.println(e.getMessage());
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }

    }

    public static void main (String [] args) {

        MusicTest1.play();
    }



}
