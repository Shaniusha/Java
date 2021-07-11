package Loan_16_6;

public class Loan {
    /**
     * сумма кредита
     */
    private Double sum;
    /**
     * проценты кредита
     */
    private Double percent;
    /**
     * срок возврата (месяцев)
     */
    private Integer returnn;
    /**
     * минимальный платеж
     */
    private Double minPayment;

    public Loan(Double sum, Double percent, Double minPayment) {
        this.sum = sum;
        this.percent = percent;
        this.minPayment = minPayment;
    }

    public Loan(Double sum, Double percent) {
        this.sum = sum;
        this.percent = percent;
    }
    /**
     * расчет срока выплаты кредита и кредитных платежей равными платежами
     *
     * @param payment месячный платеж
     */
    public  void calcSimplePayment(Double payment) {
        Double month = Math.floor(sum / payment);// сколько месяцев платить, округляем в большую сторону
        Double rest = sum;// начальный остаток выплаты = суммы кредита
        Double addSum = 0d;// сумма оплаченных процентов
        for (int i = 1; i <= month.intValue(); i++) {// цикл от 1-го месяца до последнего
            Double sumPercent = rest * percent / 12 / 100;// оплата процентов на остаток кредита
            rest = rest - payment;// из остатка вычитаем платеж = новый остаток
            addSum = addSum + sumPercent;// сумма оплаченных процентов + сумма процентов за текущий месяц

            // округление до двух значений после запятой
            addSum = (double) Math.round(addSum * 100);
            addSum = addSum / 100;

            System.out.print(i + " месяц " + ": ");
            System.out.print(rest + " - остаток выплаты от суммы кредита " + ": ");
            System.out.println(addSum + " - сумма оплаченных процентов");
        }
    }
    // Double sum = 1000 шек // сумма кредита
    // Double percent = 1 % в месяц // проценты кредита
    // Double payment = 200 шек в месяц // сумма на которую уменьшаем долг по кредиту за месяц
    // проценты расчитываются на текущий долг =  Double rest
    // Double rest = sum // начальный остаток выплаты = суммы кредита
    // Double addSum = 0d // сумма оплаченных процентов, вначале = 0

    // addSum = 10d; // 10 шек = 1 %
    //  начинается цикл
    // for (int i = 1; i <= month.intValue(); i++) { // цикл от 1-го месяца до последнего
    // Double sumPercent = rest * percent / 12 / 100; // оплата процентов на остаток кредита
    // в конце 1-го месяца месячная оплата за проценты составит 1000 * 1 / 12 / 100 = 10 шек = addSum;
    // в конце 1-го месяца заплатили банку 200 шек ;  800 = 1000 - 200 ;  rest = rest - payment
    // в конце 2-го месяца мы заплатим  800 * 1 % = 8 шек // = Double sumPercent
    // addSum = addSum + sumPercent;// сумма оплаченных процентов + сумма процентов за текущий месяц
    // 18 шек = 10(1-й месяц) + 8(2-й месяц)// за два месяца  addSum = addSum + sumPercent
    // пошел 3-й месяц
    // 600 = 800 - 200; // rest = rest - payment
    // в конце 3-го месяца мы заплатим  600 * 1 % = 6 шек // = Double sumPercent
    // addSum = addSum + sumPercent;// сумма оплаченных процентов + сумма процентов за текущий месяц
    // 24 шек = 18 шек(1-й месяц + 2-й месяц) + 6 шек // за три месяца  = addSum
    // в конце 4-го месяца мы заплатим  400 * 1 % = 4 шек // = Double sumPercent
    // 28 шек = 24 шек(1-й месяц + 2-й месяц + 3-й месяц) + 4 шек // за 4 месяца  = addSum
    // в конце 5-го месяца мы заплатим  200 * 1 % = 2 шек // = Double sumPercent
    // 30 шек = 28 шек(1-й месяц + 2-й месяц + 3-й месяц + 4-й месяц ) + 2 шек // за 5 месяцев  = addSum



    public void calcSimplePayment1(Double payment) { // payment - месячный платеж
        Double rest = sum;// начальный остаток выплаты = суммы кредита
        Integer month = 0;// сколько месяцев платить
        Double addSum = 0d;// сумма оплаченных процентов
        while (rest >= 0) {
            Double sumPercent = rest * percent / 12 / 100;// оплата процентов на остаток кредита
            rest = rest - payment;// из остатка вычитаем платеж = новый остаток
            month++;//month + 1

            // округление до двух значений после запятой
            addSum = (double) Math.round(addSum * 100);
            addSum = addSum / 100;

            System.out.println(month + " месяц " + ": ");
            System.out.println(rest + " - остаток выплаты от суммы кредита " + ": ");
            System.out.println(addSum + " - сумма оплаченных процентов");
        }
    }

    public void setMinPayment(Double minPayment) {
        this.minPayment = minPayment;
    }
}

