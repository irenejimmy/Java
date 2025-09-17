package irene;
interface Media{
	void play();
	void stop();
	default void pause() {
		System.out.println("Media paused");
		
	}
	static void about() {
		System.out.println("This is a media interface");
	}
}
interface AdvancedMedia extends Media{
	void nextTrack();
}
class MusicPlayer implements AdvancedMedia{
	public void play() {
		System.out.println("Music started");

	}
	public void stop() {
		System.out.println("Music stopped");
	}
	public void nextTrack() {
		System.out.println("Next song");
	}
}
public class Basic{
	public static void main(String[] args ) {
		MusicPlayer musicplayer=new MusicPlayer();
		musicplayer.play();
		musicplayer.nextTrack();
		musicplayer.pause();
		
		Media.about();
		musicplayer.stop();
}
}