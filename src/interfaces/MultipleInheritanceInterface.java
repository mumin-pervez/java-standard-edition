package interfaces;

interface MusicPlayer {

  default void play() {
    System.out.println("Music Player: Playing Music");
  }
}

interface VideoPlayer {

  default void play() {
    System.out.println("Video Player: Playing Video");
  }
}

class SmartTv implements MusicPlayer, VideoPlayer {


  @Override
  public void play() {
    System.out.println("Smart TV Player");
  }

  public void smartPlay() {
    MusicPlayer.super.play();
    VideoPlayer.super.play();
  }
}

public class MultipleInheritanceInterface {

  public static void main(String[] args) {
    SmartTv obj = new SmartTv();
    obj.play();
    obj.smartPlay();
  }
}
