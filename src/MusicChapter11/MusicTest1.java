package MusicChapter11;

import javax.sound.midi.*;

public class MusicTest1 {
    public static void play()  {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();// ������ ����������� "����������" �� ���������� � ������� MIDI
            System.out.println("���������� ��� ������");
            sequencer.open();

            Sequence seq = new Sequence(Sequence.PPQ,4); // ����������� �����������

            Track track = seq.createTrack();//������ ����� � ������������������
            //-------------------------------------------------
            //-----------��������� � ���� MIDI �������-------------
            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,44,100);
            MidiEvent noteOn = new MidiEvent(a,1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            a.setMessage(128,1,44,100);
            MidiEvent noteOff = new MidiEvent(b,20);
            track.add(noteOff);

            ShortMessage c = new ShortMessage();
            a.setMessage(144,1,20,100);
            MidiEvent noteOn2 = new MidiEvent(c,40);
            track.add(noteOn2);

            ShortMessage d = new ShortMessage();
            a.setMessage(128,1,20,100);
            MidiEvent noteOff2 = new MidiEvent(d,66);
            track.add(noteOff2);


            //-----------------------------------------------------------------
            sequencer.setSequence(seq); // �������� ������������������ �����������

            sequencer.start();

            System.out.println("END!");

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
