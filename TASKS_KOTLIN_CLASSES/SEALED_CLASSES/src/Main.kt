fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
    }

sealed interface Expr
sealed class IOExpr(): Expr
class Num(val value: Int) : IOExpr()
class Sum(val left: Expr, val right: Expr) : IOExpr()