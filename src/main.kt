fun main(){
    var current=CurrentAccount("39101014","Catherine",40000)
    current.deposit(4600.00)
    current.withdraw(2000.00)
    current.details()

    var user=User("Vayo",45,450,"groceries")

}
class CurrentAccount(var accountnumber:String,var accountname:String,var balance:Int){
    fun deposit(amount:Double){
        var increment=amount+balance
        println(increment)

    }
    fun withdraw(amount:Double){
        var decrement= amount-balance
        println(decrement)

    }
    fun details(){
        println("Account number $accountnumber with balance $balance is operated by $accountname ")

    }
}
class SavingsAccount(var accountnumber:String,var accountname:String,var balance:Int){
    fun withdraw(withdrawals:Int){

    }



}
data class User(var name:String,var weight:Int,var price:Int,var category:String)

fun evenNumber():String {
    var fruit = "banana"
    when(fruit){
        "banana"->
            println(list)

    }


}




