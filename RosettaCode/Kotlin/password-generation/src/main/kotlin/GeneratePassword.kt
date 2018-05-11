import com.mifmif.common.regex.Generex

fun main(args: Array<String>) {
    // Uses generex object to generate random sting from given regular expression.
    // Kind of cheating, but a very clean way of generating passwords.
    Generex("[A-Z][a-z]{8}.[0-9]{3}").random().also { println(it) }
}
