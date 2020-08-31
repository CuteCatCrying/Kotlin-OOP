fun main() {
    val myBase = MyBase()
    myBase.sayHello("Alvin")

    val baseDelegate = MyBaseDelegate(myBase)
    baseDelegate.sayHello("Ucup")
    baseDelegate.sayGoodbye("Ucup")

    val delegate = Delegate(myBase)
    delegate.sayHello("Ucup")
    delegate.sayGoodbye("Ucup")
}