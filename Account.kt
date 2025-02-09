class Account(val name : String,
              val accountNumber: String,
              var balance: Int){
    init {
        println("$name Account is created\n\t" +
                "Account Number: $accountNumber\n\t" +
                "Balance: $balance")
    }
    fun updateBalance(transaction: Transaction){
        //val amount = transaction.amount
        //balance += if  (transaction.getType() == TransactionType.INCOME) amount else -amount
    }
}