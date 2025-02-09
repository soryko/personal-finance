class Main {
    fun main(args: Array<String>){
        val manager = Manager()
        val checkingAccount = Account("checkingAccount", "0001", 0)
        manager.addAccount(checkingAccount)
        val foodBudget = Budget(Category.FOOD,150.00,BudgetPeriod.WEEKLY)
        manager.setBudget(foodBudget)
    }
}