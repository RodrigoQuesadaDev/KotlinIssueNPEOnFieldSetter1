package a

/**
 * Created by Rodrigo Quesada on 22/09/15.
 */
internal class A {

    var value: String
        set(value) {
            //useful code about to run
            val f: String = field
            f.toString()
        }

    constructor() {
        value = ""
    }
}
