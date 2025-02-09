import java.time.LocalDateTime

class Transaction(
    val id: UUID,
    val amount: Double,
    val description: String,
    val category: Category,
    val type: TransactionType,
    val date: LocalDateTime,
    val account: String
) {
    fun getId() { return id }
    fun getAmount()  { return amount }
    fun getDescription()  { return description }
    fun getCategory()  { return category }
    fun getType()  { return type }
    fun getDate()  { return date }
    fun getAccount() { return account }
}
