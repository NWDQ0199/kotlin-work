// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(string:String,censor:String,censorChar:Char='X'):String
{
    val censorString=(""+censorChar).repeat(censor.length)
    return string.replace(censor,censorString)
}