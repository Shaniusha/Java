package Cat_Years_Dog_Years_2_5;

public class Cat {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        // Your code here!
        int catYears = 0;      // return new int[]{y,y==1?15:16+4*y,y==1?15:14+5*y};
        int dogYears = 0; //return new int[]{h, h==1 ? 15 : h==2 ? 24 : 24+4*(h-2), h==1 ? 15 : h==2 ? 24 : 24+5*(h-2)};
        int[] years = new int[3];

        for (int i = 1; i <= humanYears; i++) {
            if (i == 1) {
                catYears = catYears + 15; // 1-ый год
                dogYears = dogYears + 15;
            } else if (i == 2) {
                catYears = catYears + 9; // 2-ой год
                dogYears = dogYears + 9;
            } else {
                catYears = catYears + 4; // 3-ой год, 4-ый, 5-ый и т.д
                dogYears = dogYears + 5;
            }
        }
        years[0] = humanYears;
        years[1] = catYears;
        years[2] = dogYears;
        return years;
    }
    public static int[] humanYearsCatYearsDogYears2(final int humanYears) {
        int[] res = new int [3];
        if(humanYears == 1) {
            res[0] = humanYears;//человек 1 год
            res[1] = 15;//кот
            res[2] = 15;//собака
            return res;
        }
        if(humanYears == 2){
            res[0] = humanYears;//человек 2 год
            res[1] = 15 + 9;
            res[2] = 15 + 9;
            return res;
        }
        res[0] = humanYears;
        res[1] = 15 + 9 + 4 * (humanYears - 2);//15- 1-ый год;15+9- 2-ой год;4*(8-2)- 8-ой год,8-2 т,к впереди за 2 года уже посчитали
        res[2] = 15 + 9 + 5 * (humanYears - 2);
        return res;
    }

    public static void main(String[] args) {
        int y = 8;
        int allYears[] = humanYearsCatYearsDogYears(y);
        for (int year: allYears)
            System.out.println(year);
        // где int- это тип массива   year - имя(любое я даю сама) одного эл-та массива
       //allYears - имя массива
    }
}

