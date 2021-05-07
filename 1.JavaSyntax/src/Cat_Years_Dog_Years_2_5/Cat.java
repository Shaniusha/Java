package Cat_Years_Dog_Years_2_5;

public class Cat {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        // Your code here!
        int catYears = 0;      // return new int[]{y,y==1?15:16+4*y,y==1?15:14+5*y};
        int dogYears = 0; //return new int[]{h, h==1 ? 15 : h==2 ? 24 : 24+4*(h-2), h==1 ? 15 : h==2 ? 24 : 24+5*(h-2)};
        int[] years = new int[3];

        for (int i = 1; i <= humanYears; i++) {
            if (i == 1) {
                catYears = catYears + 15;
                dogYears = dogYears + 15;
            } else if (i == 2) {
                catYears = catYears + 9;
                dogYears = dogYears + 9;
            } else {
                catYears = catYears + 4;
                dogYears = dogYears + 5;
            }
        }
        years[0] = humanYears;
        years[1] = catYears;
        years[2] = dogYears;
        return years;
    }

    public static void main(String[] args) {
        int y = 10;
        int allYears[] = humanYearsCatYearsDogYears(y);
        for (int year: allYears)
            System.out.println(year);
        // где int- это тип массива   year - имя(любое я даю сама) одного эл-та массива
       //allYears - имя массива
    }
}

