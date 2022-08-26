package MusicChapter11;

import javax.sound.midi.*;

public class MiniMusicCmdLine {

    public void play(int instrument, int note){
        try{
            Sequencer sequencer = MidiSystem.getSequencer();// ������ ����������� "����������" �� ���������� � ������� MIDI
            System.out.println("���������� ��� ������");
            sequencer.open();
            Sequence seq = new Sequence(Sequence.PPQ,4); // ����������� �����������
            Track track = seq.createTrack();//������ ����� � ������������������
            //-------------------------------------------------
            //-----------��������� � ���� MIDI �������-------------
            MidiEvent event = null;

            ShortMessage a = new ShortMessage();
            a.setMessage(192,1,instrument,0);
            MidiEvent noteOn = new MidiEvent(a,1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            a.setMessage(144,1,note,100);
            MidiEvent noteon = new MidiEvent(b,1);
            track.add(noteon);

            ShortMessage c = new ShortMessage();
            a.setMessage(128,1,note,100);
            MidiEvent noteoff = new MidiEvent(c,16);
            track.add(noteoff);
            //-----------------------------------------------------------------
            sequencer.setSequence(seq); // �������� ������������������ �����������

            sequencer.start();

            System.out.println("END!");


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MiniMusicCmdLine miniMusicCmdLine = new MiniMusicCmdLine();
//        if ( args.length < 2){
//            System.out.println("wrong args");
//        }else{
//            int instrument = Integer.parseInt(args[0]);
//            int note = Integer.parseInt(args[1]);
//            miniMusicCmdLine.play(instrument,note);
//        }
        miniMusicCmdLine.play(102,30);
        miniMusicCmdLine.play(80,20);
        miniMusicCmdLine.play(40,70);
        miniMusicCmdLine.play(20,90);
    }

}
