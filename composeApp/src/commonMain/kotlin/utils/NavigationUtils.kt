package utils

import service.emptyString
import theme.CosmosApp

object NavigationUtils {

    fun String.replaceArgs(args: Map<String, String>): String {
        var route = this
        print("\nformatting route => $this\n")
        args.forEach {
            print("\nreplacing arg '${it.key}' with ${it.value}\n")
            route = this.replace(it.key, it.value)
            print("new route => $route\n\n")
        }
        return route.removeBrackets()
    }

}

fun String.removeBrackets(): String {
    return this.replace("{", emptyString()).replace("}", emptyString())
}