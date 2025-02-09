class Manager(){
    var accounts: MutableList<Account> = mutableListOf()
    var transactoins: MutableList<Transaction> = mutableListOf()
    var budget: Int = 0

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