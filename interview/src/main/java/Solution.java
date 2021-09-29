import java.util.HashMap;
import java.util.Map;

class Solution {
	public static void main(String args[]){
		String testStr = "my.song.mp3 20000000b\ngreatSong.flac 10000000b\n	not3.txt 5b\n	video.mp4 2000000000b\ngame.exe 100b\nmov!e.mkv 1000000000b";
		System.out.println(testStr);
		System.out.println();
		
		Solution s= new Solution();
		System.out.println(s.solution(testStr));
	}
    public String solution(String S) {
    	Map<String, Long>fileDetailsMap = new HashMap<>();
    	fileDetailsMap.put("music", 0l);
    	fileDetailsMap.put("image", 0l);
    	fileDetailsMap.put("movie", 0l);
    	fileDetailsMap.put("other", 0l);
        String[] newLineSplitStrings = S.split("\n");
//        System.out.println(Arrays.toString(newLineSplitStrings));
        for (int i = 0; i < newLineSplitStrings.length; i++) {
			String trimmed = newLineSplitStrings[i].trim();
			String[] splitted = trimmed.split(" ");
			if (splitted[0].endsWith(".mp3") || splitted[0].endsWith(".aac") || splitted[0].endsWith(".flac")) {
				Long musicBytes = fileDetailsMap.get("music");
				long longValue = musicBytes.longValue(); 
				longValue += Integer.parseInt(splitted[1].substring(0, splitted[1].length()-1));
				fileDetailsMap.put("music", longValue);
			}else if (splitted[0].endsWith(".jpg") || splitted[0].endsWith(".bmp") || splitted[0].endsWith(".gif")) {
				Long musicBytes = fileDetailsMap.get("images");
				long longValue = musicBytes.intValue(); 
				longValue += Integer.parseInt(splitted[1].substring(0, splitted[1].length()-1));
				fileDetailsMap.put("image", longValue);
			}else if (splitted[0].endsWith(".mp4") || splitted[0].endsWith(".avi") || splitted[0].endsWith(".mkv")) {
				Long musicBytes = fileDetailsMap.get("movie");
				long longValue = musicBytes.intValue(); 
				longValue += Integer.parseInt(splitted[1].substring(0, splitted[1].length()-1));
				fileDetailsMap.put("movie", longValue);
			}else{
				Long musicBytes = fileDetailsMap.get("other");
				long longValue = musicBytes.intValue(); 
				longValue += Integer.parseInt(splitted[1].substring(0, splitted[1].length()-1));
				fileDetailsMap.put("other", longValue);
			}
		}
        String t1 = "music" + " " + fileDetailsMap.get("music") +"b" + "\n";
        String t2 = "images" + " " + fileDetailsMap.get("image") +"b" + "\n";
        String t3 = "movies" + " " + fileDetailsMap.get("movie") +"b" + "\n";
        String t4 = "other" + " " + fileDetailsMap.get("other") +"b" ;
        StringBuilder b = new StringBuilder();
        b.append(t1).append(t2).append(t3).append(t4);
        //fileDetailsMap.forEach((x, y) ->  b.append(x + " " + y + "b" + "\n"));
//        System.out.println(b.toString());
        return b.toString();
    }
}