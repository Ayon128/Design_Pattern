public class mediaAdapter implements MediaPlayer{
 AdvanceMediaPlayer advanceMediaPlayer;

 public mediaAdapter(String audiotype){
    if(audiotype.equalsIgnoreCase("vlc")){
        advanceMediaPlayer = new vlcPlayer();
    }
    if(audiotype.equalsIgnoreCase("mp4")){
        advanceMediaPlayer = new Mp4Plyayer();
    }
 }

 @Override

 public void play(String audiotype, String fileName){
    if(audiotype.equalsIgnoreCase("vlc")){
        advanceMediaPlayer.playVlc(fileName);
    }
    if(audiotype.equalsIgnoreCase("mp4")){
        advanceMediaPlayer.playMp4(fileName);
    }
 }
 }
    

