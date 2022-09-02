public class Test {
    public static void main(String[] args) {
        String str = "У каждого есть свой родной язык. Родной язык - это язык, на котором вы говорите с детства, на котором общаетесь на повседневной основе. Для меня это украинский язык.";
        str = str.replaceAll("(У)\\s", " java ");
        str = str.replaceAll("\\s(есть)\\s", " java ");
        str = str.replaceAll("\\s(свой)\\s", " java ");
        str = str.replaceAll("\\s(это)\\s", " java ");
        str = str.replaceAll("\\s(на)\\s", " java ");
        str = str.replaceAll("\\s(вы)\\s", " java ");
        str = str.replaceAll("\\s(с)\\s", " java ");
        str = str.replaceAll("\\s(меня)\\s", " java ");
        str = str.replaceAll("\\s(Для)\\s", " java ");
        str = str.replaceAll("\\s(котором)\\s", " java ");
        System.out.println(str);

    }
}
