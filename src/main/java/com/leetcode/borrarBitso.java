package com.leetcode;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;

import static com.leetcode.borrarBitso.UserType.BASIC;

public class borrarBitso {

    public static void main(String[] args) {
/*

        WithdrawalValidator globalValidation = (withdrawal) -> withdrawal.compareTo(globalLimit) <= 0;

        WithdrawalValidator globalValidation = (w) -> w.amount.compareTo(globalLimit) <= 0;
*/

    }


    class Withdrawal {

        private final BigDecimal amount;

        public Withdrawal(BigDecimal amount) {
            this.amount = amount;
        }

        public BigDecimal getAmount() {
            return this.amount;
        }
    }


    class WithdrawalService {


        public boolean isUnderMaxLimit() {

            Withdrawal withdrawal = new Withdrawal(BigDecimal.TEN);

            //---------------------1 forma
            WithdrawalValidator validatorGlobal2 = w -> w.amount.compareTo(BigDecimal.TEN) <= 0;
            WithdrawalValidator validatorGlobal3 = w -> w.amount.compareTo(BigDecimal.TEN) <= 0;
            WithdrawalValidator validatorGlobal4 = w -> w.amount.compareTo(BigDecimal.TEN) <= 0;

            validatorGlobal2.and(validatorGlobal3).and(validatorGlobal4);
            //--------------------- 2 forma

            WithdrawalValidator validatorGlobal = new WithdrawalValidatorGlobal();
            WithdrawalValidator validatorUser = new WithdrawalValidatorTypeUser(BASIC);
            WithdrawalValidator validatorTime = new WithdrawalValidatorByHour(BigDecimal.TEN, LocalDateTime.now());
            WithdrawalValidator validatorLocale = new WithdrawalValidatorByCountry(BigDecimal.TEN, Locale.getDefault());
            boolean x = validatorGlobal.validate(withdrawal) && validatorLocale.validate(withdrawal)
                    && validatorUser.validate(withdrawal) && validatorTime.validate(withdrawal);

            //--------------------- 3 forma

            WithdrawalValidator validatorFinal =
                    new WithdrawalValidatorByHour(BigDecimal.TEN, LocalDateTime.now())
                            .and(new WithdrawalValidatorTypeUser(BASIC))
                            .and(new WithdrawalValidatorByCountry(BigDecimal.TEN, Locale.getDefault()))
                            .and(new WithdrawalValidatorGlobal());

            validatorFinal.validate(withdrawal);
            //---------------------


            return validatorGlobal.validate(withdrawal) && validatorLocale.validate(withdrawal);
        }


        public boolean validate(Withdrawal withdrawal, WithdrawalValidator... validator) {

            for (WithdrawalValidator val : validator) {
                if (!val.validate(withdrawal)) {
                    return false;
                }
            }

            return true;
        }


    }

    //@functiona interface
    interface WithdrawalValidator {

        boolean validate(Withdrawal withdrawal);

        default WithdrawalValidator and(WithdrawalValidator other) {
            return withdrawal -> this.validate(withdrawal) && other.validate(withdrawal);
        }

    }

    class WithdrawalValidatorGlobal implements WithdrawalValidator {

        //@value
        private BigDecimal limit;

        public boolean validate(Withdrawal withdrawal) {

            return withdrawal.amount.compareTo(limit) <= 0;
        }
    }

    class WithdrawalValidatorTypeUser implements WithdrawalValidator {

        static Map<UserType, BigDecimal> amountUserType = new HashMap<>();

        private BigDecimal basicLimit;
        private BigDecimal premiumLimit;
        private UserType userType;

        public WithdrawalValidatorTypeUser(UserType userType) {
            this.amountUserType.put(BASIC, basicLimit);
            this.amountUserType.put(UserType.PREMIUM, premiumLimit);
        }

        public boolean validate(Withdrawal withdrawal) {

            return withdrawal.amount.compareTo(amountUserType.get(userType)) <= 0;
        }
    }

    class WithdrawalValidatorByHour implements WithdrawalValidator {

        private BigDecimal limit;
        private LocalDateTime localDateTime;

        public WithdrawalValidatorByHour(BigDecimal limit, LocalDateTime localDateTime) {
            this.limit = limit;
            this.localDateTime = localDateTime;
        }

        public boolean validate(Withdrawal withdrawal) {

            if (LocalDateTime.now().isBefore(localDateTime)) {
                return withdrawal.amount.compareTo(limit.add(BigDecimal.TEN)) <= 0;
            }

            return withdrawal.amount.compareTo(limit) <= 0;
        }
    }


    class WithdrawalValidatorByCountry implements WithdrawalValidator {

        private BigDecimal limit;
        private Locale locale;

        public WithdrawalValidatorByCountry(BigDecimal limit, Locale locale) {
            this.limit = limit;
            this.locale = locale;
        }

        public boolean validate(Withdrawal withdrawal) {

            if (locale.getCountry().equals("BR")) {
                return withdrawal.amount.compareTo(limit.add(BigDecimal.TEN)) <= 0;
            } else if (locale.getCountry().equals("AR")) {
                return withdrawal.amount.compareTo(limit.add(BigDecimal.TWO)) <= 0;
            }

            return withdrawal.amount.compareTo(limit) <= 0;
        }
    }


    /**
     * tipo usuerio
     * preimum  100
     * basic      10
     */
    enum UserType {
        BASIC,
        PREMIUM;
    }


}