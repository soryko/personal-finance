class Manager(){
    var accounts: MutableList<Account> = mutableListOf()
    var transactions: MutableList<Transaction> = mutableListOf()
    var budgets: MutableList<Budget> = mutableListOf()

    fun addAccount(account: Account) {
        accounts.add(account)
    }
    fun addTransaction(transaction: Transaction) {
        transactions.add(transaction)
    }
    fun setBudget(budget: Budget) {
        budgets.add(budget)
    }



    fun getExpenseByCategory(category: Category){}
    fun getTotalExpenses(){}
    fun getTotalIncome(){}
    fun getTransactionsHistory(){}
    fun getBudgetRemaining(){}
    fun getAccount(){}
    fun getAllBudgets(){}
    fun getTransactionsByDateRange(){}
    fun getMonthlyExpenses(){}
    fun getMonthlyIncome(){}
}