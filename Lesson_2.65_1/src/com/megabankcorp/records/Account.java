package com.megabankcorp.records;

import java.math.BigDecimal;

public class Account {
   int personId;
   long accountNumber;
   BigDecimal accountAmount;

   public Account(int personId, long accountNumber, BigDecimal accountAmount) {
      this.personId = personId;
      this.accountNumber = accountNumber;
      this.accountAmount = accountAmount;
   }
}
