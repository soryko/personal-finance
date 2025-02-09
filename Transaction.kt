import java.time.LocalDateTime
import java.util.*

class Transaction(
    val amount: Double,
    val description: String,
    val category: Category,
    val type: TransactionType,
    val account: String
) {
    val id: UUID = UUID.randomUUID()
    val date: LocalDateTime = LocalDateTime.now()

    init {
        println("Creating a new transaction")
        println("Amount: $amount\n\tCategory: $category\n\tType: $type\n\tAccount: $account")
    }
}
