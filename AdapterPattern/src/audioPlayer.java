public class audioPlayer implements MediaPlayer{
mediaAdapter adapter;

    @Override
    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("playing mp3 file.name"+fileName);
        }

        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            adapter = new mediaAdapter(audioType);
            adapter.play(audioType, fileName);
        }
    }
}
