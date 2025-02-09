data class Budget(
    val category: Category,
    val amount: Double,
    val period: BudgetPeriod = BudgetPeriod.MONTHLY
)
enum class BudgetPeriod{
    DAILY,
    WEEKLY,
    MONTHLY,
    YEARLY

}
