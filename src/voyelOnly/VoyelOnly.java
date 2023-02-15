package voyelOnly;

public class VoyelOnly {
    public static String voyeOnly(String input){
        String voyel = "aeiou";
        StringBuilder sb = new StringBuilder();
        for (char c: input.toCharArray()){
            if(voyel.contains(String.valueOf(c).toLowerCase())){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
