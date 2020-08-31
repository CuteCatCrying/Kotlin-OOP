class Company(val name: String) {
    override fun hashCode(): Int {
        return name.hashCode()
    }
}