public class ChessHorse {
    public static void main(String[] args) {
        String row_location_horse = "e";
        int string_location_horse = 5;
        String row_checking_position = "c";
        int stringe_checking_position = 4;
        int i = 0,j,k = 0,l;

        switch (row_location_horse){
            case "a" : i = 1;break;  //преобразуем буквы в цифры. координаты коня
            case "b" : i = 2;break;
            case "c" : i = 3;break;
            case "d" : i = 4;break;
            case "e" : i = 5;break;
            case "f" : i = 6;break;
            case "g" : i = 7;break;
            case "h" : i = 8;break;
        }
        switch (row_checking_position){
            case "a" : k = 1; break;  //преобразуем буквы в цифры. проверяемые координаты
            case "b" : k = 2; break;
            case "c" : k = 3; break;
            case "d" : k = 4; break;
            case "e" : k = 5; break;
            case "f" : k = 6; break;
            case "g" : k = 7; break;
            case "h" : k = 8; break;
        }
        //if (((Math.abs(k-i) == 1)|(Math.abs(k-i) == 2))&&((Math.abs(string_location_horse - stringe_checking_position) == 1)|(Math.abs(string_location_horse - stringe_checking_position)))){
          if((Math.abs(k-i) == 1)&&(Math.abs(string_location_horse - stringe_checking_position) == 2)){
            System.out.println("Конь может ходить следующим ходом на " + row_checking_position + stringe_checking_position);
          }
        if((Math.abs(k-i) == 2)&&(Math.abs(string_location_horse - stringe_checking_position) == 1)){
            System.out.println("Конь может ходить следующим ходом на " + row_checking_position + stringe_checking_position);

        }
    }
}
