class Account(val name : String,
              val accountNumber: String,
              var balance: Int){

    fun updateBalance(transaction: Transaction){
        val amount = transaction.amount
        balance += if  (transaction.getType() == TransactionType.INCOME) amount else -amount
        }
    }
}