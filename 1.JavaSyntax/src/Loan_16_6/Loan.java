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
    public void calcSimplePayment(Double payment) {
        Double month = Math.floor(sum / payment);// сколько месяцев платить, округляем в большую сторону
        Double rest = sum;// начальный остаток выплаты = суммы кредита
        Double addSum = 0d;// сумма оплаченных процентов
        for (int i = 1; i <= month.intValue(); i++) {// цикл от 1-го месяца до последнего
            Double sumPercent = rest * percent / 12 / 100;// оплата процентов на остаток кредита
            rest = rest - payment;// из остатка вычитаем платеж = новый остаток
            addSum = addSum + sumPercent;
            // округление до двух значений после запятой
            addSum = (double) Math.round(addSum * 100);
            addSum = addSum / 100;

            System.out.print(i +" месяц " + ": "  );
            System.out.print(rest + " - остаток выплаты от суммы кредита " + ": ");
            System.out.println(addSum + " - сумма оплаченных процентов");
        }
    }
    public void calcSimplePayment1(Double payment) {
        Double rest = sum;
        Integer month = 0;
        Double addSum = 0d;
        while (rest >= 0){
            Double sumPercent = rest * percent / 12 / 100;
            rest = rest - payment;
            month++;//month + 1
            addSum = (double) Math.round(addSum * 100);
            addSum = addSum / 100;
            System.out.println(month +" месяц " + ": " );
            System.out.println(rest + " - остаток выплаты от суммы кредита " + ": ");
            System.out.println(addSum + " - сумма оплаченных процентов");
        }
    }

    public void setMinPayment(Double minPayment) {
        this.minPayment = minPayment;
    }
}
