fun main() {
    val premiumCustomer = PremiumCustomer("Alvin")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Alvin", 50000);
    println(executiveCustomer.type)
    println(executiveCustomer.balance)
}