public class Dubstep {
  public static String SongDecoder (String song)
  {
     /* song = song.replaceAll("WUB", " ");
      String[] strArray = song.split(" ");
      song = "";
      for (String s : strArray) {
          if (s.isEmpty())
              continue;
          song += s.trim() + " ";
      }
      return song.trim();*/

      /*return Stream.of(song.split("WUB")).filter(s -> ! s.isEmpty()).collect(Collectors.joining(" "));*/

      return song.replaceAll("(WUB)+", " ").trim();
   }

    public static void main(String[] args) {
        System.out.println(SongDecoder("RWUBWUBWUBLWUB"));
    }
}