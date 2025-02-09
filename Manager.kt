class Manager(
    val account: Account,
    val transaction: Transaction,
    val budget = Int
) {
    fun addAccount(account: Account) {}
    fun setBudget(category: Category, amount: Double){}
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