package HW17Polymorphism;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicStyles = new MusicStyles[] {
                new PopMusic(),
                new RockMusic(),
                new ClassicMusic()
        };

        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }
}
